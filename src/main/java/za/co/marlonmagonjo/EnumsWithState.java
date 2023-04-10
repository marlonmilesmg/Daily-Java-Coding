package za.co.marlonmagonjo;

enum Color {
    RED("#ff0000"),
    GREEN("#00ff00"),
    BLUE("#0000ff");

    String code;

    Color (String code ){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}



public class EnumsWithState {

    static void print(Color color){
        System.out.println("Printing the color - " + color);
        System.out.println("Using the code - " +color.getCode());
    }
    public static void main(String[] args) {
        print(Color.RED);
        System.out.println("====================================");
        print(Color.BLUE);
        System.out.println("=======================================");
        print(Color.GREEN);
        System.out.println("==============================================");

        Color color = Color.valueOf("BLUE");
        print(color);
    }
}
