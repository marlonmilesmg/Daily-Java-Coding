package za.co.marlonmagonjo;

public class AdditionOfIntDouble {

    @SafeVarargs
    static <T extends Number> double sum(T ... a){
        double s = 0;
        for(T value:a){
            s+=value.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10.1, 20.2, 30.3, 40.6, 50.54678));
    }
}
