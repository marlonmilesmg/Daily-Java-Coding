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

        // reading and copying one Byte at a time
        int value;
        while((value = fileInputStream.read()) != -1){
            fileOutputStream.write(value);
        }

        fileInputStream.close();
        fileOutputStream.close();

        // reading 1024 bytes at a time
        File sourceFile1 = new File(baseDir, "c.txt");
        File destinationFile1 = new File(baseDir, "d.txt");

        FileInputStream fileInputStream1 = new FileInputStream(sourceFile1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(destinationFile1);

        byte [] buffer = new byte[1024];
        int n;

        // write buffer only bytes from 0 to n
        while((n = fileInputStream1.read(buffer)) > 0 ){
            fileOutputStream1.write(buffer, 0, n);
        }

        fileInputStream1.close();
        fileInputStream1.close();
    }
}
