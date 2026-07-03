import java.util.ArrayList;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManagement {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Kartik", "9876543210"));
        contacts.add(new Contact("Rahul", "9123456789"));

        System.out.println("Contact List:");

        for (Contact c : contacts) {
            System.out.println("Name: " + c.name);
            System.out.println("Phone: " + c.phone);
        }
    }
}
