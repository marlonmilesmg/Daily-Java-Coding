package za.co.marlonmagonjo;

/**
     S - Single Responsibility Principle -
            A class should have one and only one reason to change

     O - Open Closed Principle -
            Objects or entities should be open for extension but closed for modification

     L - Liskov Substitution Principle
            Objects of super class shall be replaced with objects of subclasses - new code or features must not break existing fuctionality

     I - Interface Segregation Principle
            A client should never be forced to implement an interface that it does not use

 */

class AscComparator implements ValueComparator {

    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}

class DescComparator implements ValueComparator {

    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}

interface ValueComparator {
    // @return +ve if value1 > value2, -ve if value1 < value2, 0 if value1 = value2
    int compare(int value1, int value2);
}

class ArrayUtil {
    public static void sortAscending(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i +1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i +1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sort(int[] arr, ValueComparator comparator){
        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(comparator.compare(arr[i], arr[j]) > 0 ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        int [] arr = {1, 3, 56, 23, 12, 41};
        ArrayUtil.sortAscending(arr);
        System.out.println("Values in the array are: - Sorted in Ascending Order");
        for(int ele : arr){
            System.out.println(ele);
        }

        System.out.println("================================================");
        ArrayUtil.sortDescending(arr);
        System.out.println("Values in the array are: - Sorted in Descending Order");
        for (int element: arr){
            System.out.println(element);
        }

        int [] arr1 = {1, 3, 56, 23, 12, 41};
        System.out.println("==================================================");
        System.out.println("Values sorted again in Ascending Order: - ");
        ArrayUtil.sort(arr1, new AscComparator());
        for(int element: arr1){
            System.out.println(element);
        }

        System.out.println("==================================================");
        System.out.println("Values sorted again in Descending Order: - ");
        ArrayUtil.sort(arr1, new DescComparator());
        for(int element: arr1){
            System.out.println(element);
        }

    }
}
