package za.co.marlonmagonjo;

/**
 *  Overloading -
 *      Providing multiple definitions to the same identifier
 */

class SearchUtil {
    // returns the index if found otherwise return -1
    public static int search(int [] arr, int element){
        return search(arr, 0, element);
    }

    public static int search(int [] arr, int position, int element){
        for(int i = position; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}

public class MethodOverloadingg {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 30, 60, 70, 30};
        int searchElement = 30;

        int index = -1;
        do {
            index = SearchUtil.search(array, index + 1, searchElement);
            if (index != -1) {
                System.out.println("Found at - " + index);
            } else {
                System.out.println("Not Found!");
            }
        } while (index != -1);
    }
}
