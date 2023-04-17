package za.co.marlonmagonjo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *  Annotations -
 *
 *  Provide a form of metadata about the class/field/method. They don't have direct effect on the code.
 *  Mostly used by framework components.
 *
 *  Several uses include
 *      - Provide information for the compiler
 *      - Tools can use it to get additional info as code generators, json serialization
 *      - Some annotations are available to be processed at runtime.
 *
 *
 *  Example 1 - JPA Entities
 *
 *      @Entity
 *      @Table(name = "User")
 *      public class User {
 *
 *      @Id
 *      @GeneratedValue(strategy = GenerationType.IDENTITY)
 *      private Long id;
 *
 *      private String name;
 *      ...
 *      ...
 *
 *      }
 *
 *  Example 2 - Spring
 *
 *      @Service
 *      public class AccountService {
 *
 *      @Autowired
 *      NotificationService notificationService;
 *
 *      ......
 *
 *      }
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
    String version() default "";
    String description() default "";
}

@Author(name = "Marlon", version = "1.0", description = "Account Service")
class ExampleAccountService {

}

public class Annotations {
    public static void main(String[] args) {
        Class clazz = ExampleAccountService.class;
        Author author = (Author) clazz.getDeclaredAnnotation(Author.class);
        System.out.println("Author name - " + author.name());
        System.out.println("Version - " + author.version());
        System.out.println("Description - " + author.description());
    }
}
