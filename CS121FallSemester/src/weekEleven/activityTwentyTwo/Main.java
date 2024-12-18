package weekEleven.activityTwentyTwo;
import java.util.LinkedList;

public class Main {
    private String name;
    private String ticketType;
    private int seatNumber;
    private LinkedList<String> entries;

    public Main(String name, String ticketType, int seatNumber) {
        this.name = name;
        this.ticketType = ticketType;
        this.seatNumber = seatNumber;
        this.entries = new LinkedList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public void removeEntry() {
        entries.removeFirst();
    }

    public void getInfo() {
        System.out.printf( "Customer: %s\nTicket Type: %s\nSeat #: %d\n\n",name,ticketType,seatNumber);
    }

    public void displayEntries(int num) {
        System.out.printf("\nUpdated Entries for Booking %s\nEntries for %s: ",num,name);
        System.out.println(entries);
    }
}
