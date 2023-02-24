package za.co.marlonmagonjo;

public class VariableArguments {

    static int sum(int ... a){
        int s = 0;
        for(int value : a){
            s += value;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }
}
