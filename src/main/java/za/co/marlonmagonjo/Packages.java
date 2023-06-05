package za.co.marlonmagonjo;
import za.co.marlonmagonjo.packages.demo.service.AccountService;
import za.co.marlonmagonjo.packages.demo.service.CardService;
import za.co.marlonmagonjo.packages.demo.util.DateUtil;
import java.util.Date;
import static java.lang.System.out;

/**
 *
 *  Packages - normal naming convention
 *
 *   Access modifier for class
 *      - default: accessible only within the package
 *      - public: accessible outside of package
 *
 *   Access modifier for members-
 *      - private: accessible only within that class
 *      - default: package level access
 *      - protected: package level + derived classes
 *      - public: accessible
 *
 *  Outside Packages
 *      - Sub classes: have access to protected and public
 *
 */

public class Packages {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();

        CardService cardService = new CardService();
        cardService.newCard();

        System.out.println(DateUtil.formartDate(new Date()));

        out.println("This is because of the static import");
    }
}
