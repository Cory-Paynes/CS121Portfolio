package weekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args)
    {

        // Instantiate the Person class
        Person person = new Person("John", "Doe", 30, "123 Main St", "123-1234");

        // Testing public variables
        System.out.println("First Name: " + person.firstName); // Accessible
        System.out.println("Last Name: " + person.lastName); // Accessible

        person.printName();

        //person.printInfo();


        person.setPhoneNumber("123-4567");
        System.out.println("Updated Phone Number: " + person.getPhoneNumber());

        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());
    }
}
