package za.co.marlonmagonjo;

public class GenericMethods {
    public static void display(Integer [] arr){
        for(Integer value : arr){
            System.out.println(value);
        }
    }

    // method overloading
    public static void display(Double [] arr){
        for(Double value : arr){
            System.out.println(value);
        }
    }

    // method overloading
    public static void display(String [] arr){
        for(String value : arr){
            System.out.println(value);
        }
    }

    // Generic Method
    public static <T> void display(T [] arr){
        for(T value : arr){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Integer [] arr = {10, 20, 30};
        display(arr);
        System.out.println("================================");

        Double [] arr1 = {10.3, 12.5, 45.8, 34.6};
        display(arr1);
        System.out.println("==================================");

        String [] arr2 = {"asd", "qwe", "zxc", "poe"};
        display(arr2);
        System.out.println("=====================================");
    }
}
