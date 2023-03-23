package za.co.marlonmagonjo;

class SampleOverride{

    @Override
    public String toString(){
        return "Overriding toString()...";
    }
}

public class OverrideToString {
    public static void main(String[] args) {
        SampleOverride sampleOverride = new SampleOverride();
        System.out.println(sampleOverride);
    }
}
