package za.co.marlonmagonjo.packages.demo.service;

public class AccountService {
    private AccountInternalService internalService = new AccountInternalService();
    public void openAccount() {
        System.out.println("Opening an Account - " + internalService.generateAccountID());
    }
}
