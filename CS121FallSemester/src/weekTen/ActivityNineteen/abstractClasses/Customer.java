package weekTen.ActivityNineteen.abstractClasses;

public class Customer extends Vehicle {
    //fields/variables
    private String name;
    private String contactInfo;
    private String password;
    //default constructor
    public Customer(){
    }
    public Customer(String make, String model, String vehicleId, int year,String
            name, String contactInfo, String password){
        super(make,model,vehicleId,year);
        this.name = name;
        this.contactInfo = contactInfo;
        this.password = password;
    }
    @Override
    public void displayDetails(){
        System.out.printf("Customer: %s%nContact Information: %s%nPassword:%s" +
                "%n***************CarInformation***************\nMake:%s%nModel:%s%nVehicleId:%s%nYear:%d%n"
                ,name,contactInfo,password,make,model,vehicleID,year);
    }
}
