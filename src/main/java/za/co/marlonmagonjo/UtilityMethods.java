package za.co.marlonmagonjo;

/**
 *  Static members - Use Case
 *  - Sometimes it is good to avoid object creation and declare the methods as static
 *      so that the members are accessible directly using the class name without the
 *      need for object creation (or) instantiation
 *  - Ideal for utilities
 *  Note: but it's not always the case
 */

class ArrayUtils {
    // Return the index of the element if it is found, otherwise -1
    // @param arr @param element @return
    // by making the method static we are allowing the class to do direct search without object creation
    public static int search(int [] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
public class UtilityMethods {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};
        int searchElement = 30;

        int index = ArrayUtils.search( array , searchElement);

        if(index != -1){
            System.out.println("Found at: " + index);
        } else {
            System.out.println("Not found!");
        }
    }
}
