package za.co.marlonmagonjo;

/*
* Local Classes
*   - Classes which are local to the block
*   - They can only access to the final and effectively final variables
*
* Anonymous Classes
*   - A class instantaneously created with-out any name
*
 */
public class LocalClasses {
    static void test(){
        final String name = "Marlon";
        class Local {
            public void sayHello(){
                System.out.println("Hello  from Local Class! " + name);
            }
        }

        Local local = new Local();
        local.sayHello();
    }
    public static void main(String[] args) {
        test();
    }
}
