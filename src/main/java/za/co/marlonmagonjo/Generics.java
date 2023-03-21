package za.co.marlonmagonjo;

class SampleClasss<T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generics {
    public static void main(String[] args) {
        SampleClasss<Integer> sampleClasss = new SampleClasss<>();
        sampleClasss.setValue(10);
        System.out.println( "Generics on Integer - " + sampleClasss.getValue());
        System.out.println("==================================================");

        SampleClasss<Double> sampleClasss1 = new SampleClasss<>();
        sampleClasss1.setValue(14.5);
        System.out.println("Generics on Double - " + sampleClasss1.getValue());
        System.out.println("===================================================");

        SampleClasss<String> sampleClasss2 = new SampleClasss<>();
        sampleClasss2.setValue("ASDF");
        System.out.println("Generics on Strings - " +sampleClasss2.getValue());
        System.out.println("====================================================");
    }
}
