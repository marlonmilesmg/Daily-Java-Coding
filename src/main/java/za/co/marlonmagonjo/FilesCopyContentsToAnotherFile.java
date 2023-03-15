package za.co.marlonmagonjo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesCopyContentsToAnotherFile {
    public static void main(String[] args) throws IOException{
        File baseDir = new File("C:/Users/ASA-2022/IdeaProjects/Daily_Coding_Practice_JAVA/src/main/resources");
        File sourceFile = new File(baseDir, "a.txt");
        File destinationFile = new File(baseDir, "b.txt");

        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);

        int value;
        while((value = fileInputStream.read()) != -1){
            fileOutputStream.write(value);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
