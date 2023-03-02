package za.co.marlonmagonjo;

import java.util.HashMap;
import java.util.Optional;

interface Dictionary{
    Optional<String> getMeaning(String word);
    void modifyMeaning(String word, String meaning);
}

class DictionaryImpl implements Dictionary{

    private HashMap<String, String> dictionary = new HashMap<String, String>();

    @Override
    public Optional<String> getMeaning(String word) {
        String meaning = dictionary.get(word);
        if (meaning == null){
            return Optional.empty();
        }else {
            return Optional.of(meaning);
        }
    }

    @Override
    public void modifyMeaning(String word, String meaning) {
        dictionary.put(word, meaning);
    }
}

// virtual proxy
class VirtualProxyImpl implements Dictionary{

    // lazy initialization
    private DictionaryImpl dictionary = null;

    private Dictionary getDictionary(){
        if (dictionary == null){
            System.out.println("Dictionary Object Created");
            dictionary = new DictionaryImpl();
        }
        return dictionary;
    }
    @Override
    public Optional<String> getMeaning(String word) {
        return getDictionary().getMeaning(word);
    }

    @Override
    public void modifyMeaning(String word, String meaning) {
        getDictionary().modifyMeaning(word, meaning);
    }
}

// protection proxy
class ReadOnlyDictionary implements Dictionary{

    private Dictionary dictionary = new DictionaryImpl();

    @Override
    public Optional<String> getMeaning(String word) {
        return dictionary.getMeaning(word);
    }

    @Override
    public void modifyMeaning(String word, String meaning) {
        throw new UnsupportedOperationException("You Cannot Modify");
    }
}
public class ProxyDesignPatternExtended {
    public static void main(String[] args) {
        // virtual proxy helps create an object only when it is needed
        Dictionary dictionary = new VirtualProxyImpl();
        dictionary.modifyMeaning("someWord", "someMeaning");
        System.out.println("==================================================");

        Dictionary dictionary1 = new ReadOnlyDictionary();
        dictionary1.modifyMeaning("someWord", "someMeaning");
    }
}
