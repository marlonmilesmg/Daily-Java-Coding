package za.co.marlonmagonjo;

interface StockAPI{
    String getQuote(String sticker);

}

// ----------------Remote Service---------------
// Actual Implementation
class StockAPIImpl implements StockAPI{

    @Override
    public String getQuote(String sticker) {
        return "100";
    }
}
// -------------------------------------------

class StockAPIProxy implements StockAPI{

    @Override
    public String getQuote(String sticker) {
        // make actual API call
        StockAPIImpl impl = new StockAPIImpl();
        return impl.getQuote(sticker);
    }
}
public class ProxyDesignPattern {

    public static void main(String[] args) {
        // Client
        StockAPI stockAPI = new StockAPIProxy();
        String quote = stockAPI.getQuote("exampleSticker");
        System.out.println(quote);
    }
}
