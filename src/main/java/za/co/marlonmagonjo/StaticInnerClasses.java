package za.co.marlonmagonjo;

class Person {
    private String firstName;
    private String lastName;

    public Person(){

    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void display(){
        System.out.printf("The Person's firstname is %s \n and lastname is %s \n ", firstName, lastName);
    }

    static class PersonBuiler{
        Person internalState = new Person();

        // fluent interface
        public PersonBuiler withFirstName(String firstName){
            internalState.firstName = firstName;
            return this;
        }

        public PersonBuiler withLastName(String lastName){
            internalState.lastName = lastName;
            return this;
        }

        public Person build(){
            return internalState;
        }
    }

}
public class StaticInnerClasses {
    public static void main(String[] args) {
        Person person = new Person("Marlon", "Magonjo");
        System.out.println(person);
        person.display();
        System.out.println("=========================================");

        Person.PersonBuiler personBuiler = new Person.PersonBuiler();
        personBuiler.withFirstName("John");
        personBuiler.withLastName("Doe");
        Person p = personBuiler.build();
        p.display();
        System.out.println("===========================================");

        Person.PersonBuiler personBuiler1 = new Person.PersonBuiler();
        Person person1 = personBuiler1
                .withFirstName("Example")
                .withLastName("Dotcom")
                .build();
        person1.display();
    }
}
