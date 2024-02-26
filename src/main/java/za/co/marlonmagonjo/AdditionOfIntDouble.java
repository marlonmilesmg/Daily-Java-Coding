package za.co.marlonmagonjo;

public class AdditionOfIntDouble {

    /**
     * The time complexity of the provided method is O(n), where "n" is the number of elements in the array "a."
     * The method iterates through each element of the array once, performing a constant-time operation for each element
     * (adding its double value to the running sum). As a result, the time complexity is linear with respect to the size of the array.
     *
     * @param a
     * @return
     * @param <T>
     */
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
