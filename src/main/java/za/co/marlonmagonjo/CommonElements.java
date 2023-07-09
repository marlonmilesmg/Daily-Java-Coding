package za.co.marlonmagonjo;

public class CommonElements {

    public static int commonElementsInArray(String [] arrayInput1, String [] arrayInput2){
        int count = 0;

        for(String element : arrayInput1){
            for(String element1 : arrayInput2){
                if(element.equals(element1)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String [] arrayInput1 = {"aa", "bb", "cc", "dd", "eee", "gg", "f"};
        String [] arrayInput2 = {"aa", "bbb", "cc", "ddddd", "ee", "gg"};

        int commonElementsCount = commonElementsInArray(arrayInput1, arrayInput2);

        System.out.println("The Number of Common Elemets is: " + commonElementsCount);
    }
}
