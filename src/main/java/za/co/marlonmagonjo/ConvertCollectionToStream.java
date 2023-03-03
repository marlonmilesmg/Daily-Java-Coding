package za.co.marlonmagonjo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConvertCollectionToStream {

    public static void main(String[] args) throws Exception{
        // collections stream
        List<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("zxc");
        list.add("kjhg");
        list.add("1234");

        // lambda
        list.stream()
                .forEach(x -> System.out.println(x));

        System.out.println("============================");

        // method referencing
        list.stream()
                .forEach(System.out::println);

        // reading contents of a txt file - files stream
        System.out.println("Contents of file sample.txt");
        Files.lines(Path.of("C:/Users/ASA-2022/Documents/sample.txt"))
                .forEach(System.out::println);

    }
}
