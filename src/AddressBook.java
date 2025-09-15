import java.util.*;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        return buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
