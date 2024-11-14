package za.co.marlonmagonjo.questionandanswer;

public class Test2 {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }
}
