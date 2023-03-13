package za.co.marlonmagonjo;

import java.io.File;
import java.io.IOException;

public class FilesIntroduction {
    public static void main(String[] args) throws IOException {
        // creating a new file
        File basePath = new File("C:/Users/ASA-2022/IdeaProjects/Daily_Coding_Practice_JAVA/src/main/resources");
        File file = new File(basePath, "a.txt");
        file.createNewFile();
        System.out.println(file.getName() + " - length : " + file.length());

        // check if file exists
        File file1 = new File(basePath, "b.txt");
        if(file1.isFile()){
            System.out.println(file1.getName() + " exists");
        } else {
            System.out.println(file1.getName() + " does not exist");
        }

    }
}
