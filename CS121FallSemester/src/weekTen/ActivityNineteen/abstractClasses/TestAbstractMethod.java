package weekTen.ActivityNineteen.abstractClasses;

public class TestAbstractMethod {
    public static void main(String[] args) {
        Customer Lila = new Customer("Honda","Civic","123654",2021,"Lila P.","lilaPiony@gmail.com","1@3T45**$wnd");
        Lila.displayDetails();
        Dealership HondaFordAnderson = new
                Dealership("Tesla","X","11111444777",2023,"HondaFord","Anderson");
        HondaFordAnderson.displayDetails(); // display dealership information
        HondaFordAnderson.register();
        HondaFordAnderson.login();
        HondaFordAnderson.viewProfile();
        HondaFordAnderson.sendMessage("I forgot my login information. How can I reset my information?");
    }
}

