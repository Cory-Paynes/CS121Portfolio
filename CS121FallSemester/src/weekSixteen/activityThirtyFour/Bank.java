package weekSixteen.activityThirtyFour;

public class Bank
{
    //Instance member variables(fields)
//distinguish the difference between static vs instance fields
    private String make,model, condition;
    private int year;
    //private double price = -1;
//Static (class) variable to keep track of instances.
    private static int instanceCount = 0;
    //Default constructor
//Initialize everything to null or zero
    Bank(){
        instanceCount++; //Increment the instance count
    }
    //parameterized constructor
    Bank(String make, String model){
        this.make = make;
        this.model = model;
        instanceCount++; //Increment the instance count
    }
    //parameterized constructor
    Bank(String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        instanceCount++; //Increment the instance count
    }
    Bank(int year){
        this.year = year;
        instanceCount++; //Increment the instance count
    }
    Bank(double price){
//this.price = price;
        instanceCount++; //Increment the instance count
    }
    Bank(String condition){
        this.condition = condition;
        instanceCount++; //Increment the instance count
    }
    // If I want to keep my classes attributes (variables) fields hidden from
    other classes.
    //What is this called? --> encapsulation
// Since we want other classes to access or change hidden values we can use
    getters and setters
    // mutator and accessor methods
//SETTERS
// Setter for make
    public void setMake(String make) {
        this.make = make;
    }
    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }
    // Setter for price
    public void setPrice(double price) {
//this.price = price;
    }
    // Setter for condition
    public void setCondition(String condition) {
        this.condition = condition;
    }
    //GETTERS
// Getter for make
    public String getMake() {
        return make;
    }
    // Getter for model
    public String getModel() {
        return model;
    }
    // Getter for year
    public int getYear() {
        return year;
    }
    // Getter for price
/* public double getPrice() {
return price;
}
*/
// Getter for condition
    public String getCondition() {
        return condition;
    }
    public void showDetails(){
// System.out.println("The Car you entered is a " + make + " " + model + "
        from " + year +
// " with a price of $" + price + " in " + condition + "
        condition.");
        System.out.println("The Car you entered is a " + make + " " + model + "
                from " + year + " in " + condition + " condition.");
    }
    // Static method to return the value of the static variable (instanceCount)
//distinguish the difference between static vs. instance
    public static int getInstanceCount() {
        return instanceCount;
    }

}
