package za.co.marlonmagonjo;

/**
 *  Classes -
 *      class { data + operations} + data hiding + encapsulation
 *      class is a template for design
 */

class Account {
    private double balance;

    public void withdraw(double amount) {
        if((amount >= 0 && (balance - amount > 0))){
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class CurrentAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(1000);
        account.deposit(-900);
        account.withdraw(-7000);

        System.out.println(account.getBalance());
        System.out.println("===========================================");
    }
}
