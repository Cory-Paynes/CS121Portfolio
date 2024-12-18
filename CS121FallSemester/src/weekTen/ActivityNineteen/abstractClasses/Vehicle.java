package weekTen.ActivityNineteen.abstractClasses;

//abstract class be Vehicle
public abstract class Vehicle {
    //Instance variable (fields)
    protected String make;
    protected String model;
    protected String vehicleID;
    protected int year;
    //default constructor
// null or 0
    public Vehicle(){
    }
    //parameterized constructor
    public Vehicle(String Make, String Model, String VehicleId, int Year){
        this.make = Make;
        this.model = Model;
        this.vehicleID = VehicleId;
        this.year = Year;
    }
    //Setters and Getters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    //Include my Abstract
    //signature
    //abstract class
    //include keyword
    public abstract void displayDetails();
}

