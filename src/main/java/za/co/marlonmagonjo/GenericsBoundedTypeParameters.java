package za.co.marlonmagonjo;

class DemoClass<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class GenericsBoundedTypeParameters {
    public static void main(String[] args) {
        DemoClass<Integer> demoClass = new DemoClass<>();
        demoClass.setValue(10);
        System.out.println(demoClass.getValue());
        System.out.println("======================================");

        DemoClass<Double> demoClass1 = new DemoClass<>();
        demoClass1.setValue(14.5);
        System.out.println(demoClass1.getValue());
        System.out.println("=====================================");

        DemoClass<String> demoClass2 = new DemoClass<>();
        demoClass2.setValue("ASDF");
        System.out.println(demoClass2.getValue());
        System.out.println("=======================================");
    }
}
