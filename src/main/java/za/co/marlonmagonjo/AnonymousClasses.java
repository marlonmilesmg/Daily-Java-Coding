package za.co.marlonmagonjo;

import java.io.File;
import java.io.FilenameFilter;

class Base{
    public void f() {
        System.out.println("f() in Base");
    }

    public void g() {
        System.out.println("g() in Base");
    }
}
public class AnonymousClasses {
    public static void main(String[] args) {
        Base base = new Base();
        base.f();
        base.g();
        System.out.println("===========================================");

        Base base1 = new Base() {
            @Override
            public void g() {
                System.out.println("g() in anonymous derived");
            }
        };
        base1.f();
        base1.g();
        System.out.println("================================================");

        File baseDir = new File("C:/Users/ASA-2022/IdeaProjects/Daily_Coding_Practice_JAVA/src/main/resources");

        File[] filesPresent = baseDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        FilesUtil.display(filesPresent);
        System.out.println("=============================================");

        File[] checkFiles = baseDir.listFiles(((dir, name) -> name.endsWith(".xml")));
        FilesUtil.display(checkFiles);
    }
}
