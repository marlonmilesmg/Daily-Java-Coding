package za.co.marlonmagonjo;

/**
 *  Overriding -
 *      Mechanism to modify/replace an existing function od the base class
 */

class Personn{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Name is - " + name);
    }
}

class Contact extends Personn {
    private String address;
    public void setAddress(String address){
        this.address = address;
    }
    public void print(){
        super.print();
        System.out.println("Address is - " + address);
    }
}
public class Overriding {
    public static void main(String[] args) {
        Personn personn = new Personn();
        personn.setName("John");
        personn.print();
        System.out.println("=========================");

        Contact contact = new Contact();
        contact.setName("Miles");
        contact.setAddress("1 Eglin Road");
        contact.print();
        System.out.println("=========================");


    }
}
