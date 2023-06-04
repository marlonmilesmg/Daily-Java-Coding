package za.co.marlonmagonjo;

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
        za.co.marlonmagonjo.packages.demo.service.AccountService accountService = new za.co.marlonmagonjo.packages.demo.service.AccountService();

        accountService.openAccount();

        za.co.marlonmagonjo.packages.demo.service.CardService cardService = new za.co.marlonmagonjo.packages.demo.service.CardService();

        cardService.newCard();
    }
}
