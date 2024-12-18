package weekEight.packageDemo;

public class Person {

    public String firstName;
    public String lastName;
    private int age;
    private String address;
    private String phoneNumber;


    public Person(String firstName, String lastName, int age, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    private void printInfo() {
        System.out.printf("Phone Number: \nAge: \nAddress: \n",phoneNumber,age,address);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
