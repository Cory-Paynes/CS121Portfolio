package weekTen.ActivityNineteen.interfaces;

public interface UserInteractable {
    //The fields/variables are going to be static and final.
//Don't want this --> String color ="Blue"; --> use abstract class instead
    void register();
    void login();
    void sendMessage(String message);
    void viewProfile();
}

