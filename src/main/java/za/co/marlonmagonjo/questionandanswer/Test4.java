package za.co.marlonmagonjo.questionandanswer;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}