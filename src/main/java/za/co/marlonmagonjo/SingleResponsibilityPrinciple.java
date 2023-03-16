package za.co.marlonmagonjo;

//    S - Single Responsibility Principle -
//        A class should have one and only one reason to change
//
//    O - Open Closed Principle -
//        Objects or entities should be open for extension but closed for modification
//
//    L -

class AccountService{
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount(){
        // 1. First Responsibility
        System.out.println("Fill account internal details");

        repository.create();

        notificationService.sendNotification();
    }
}

class AccountRepository {
    public void create(){
        // 2. Second Responsibility
        System.out.println("Store account object in database");
    }
}

class NotificationService {
    public void sendNotification(){
        // 3. Third Responsibility
        System.out.println("Send out welcome message");
    }
}
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();
    }
}
