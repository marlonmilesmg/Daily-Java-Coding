package za.co.marlonmagonjo;

public class VariableArgumentsWithGenericTypes {

    @SafeVarargs
    static <T extends Number> double sum(T ... a){
        double s = 0;
        for(T value : a){
            s += value.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 24, 45));
        System.out.println(sum(12.3, 46, 62.4, 23));
    }
}
