package za.co.marlonmagonjo;

import java.io.File;
import java.io.FilenameFilter;

class FilesUtil{
    public static void display(File[] files){
        for (File file: files) {
            System.out.println("File Present: " + file.getName());
        }
    }
}

class JavaFileFilter implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}

public class ListFilesInDirectory {
    public static void main(String[] args) {
        // list files contained in a directory
        File baseDir = new File("C:/Users/ASA-2022/IdeaProjects/Daily_Coding_Practice_JAVA/src/main/resources");
        File[] files = baseDir.listFiles();
        FilesUtil.display(files);
        System.out.println("======================================");

        // filter out java files only
        System.out.println("Java Files Only");
        File[] javaFiles = baseDir.listFiles(new JavaFileFilter());
        FilesUtil.display(javaFiles);
    }
}
