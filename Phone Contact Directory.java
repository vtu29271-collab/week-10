import java.util.HashMap;
import java.util.Scanner;

class PhoneDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> contacts = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone number: ");
            String phone = sc.nextLine();

            contacts.put(name, phone);
        }

        System.out.print("\nEnter name to search: ");
        String name = sc.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Phone Number: " + contacts.get(name));

            System.out.print("Enter new phone number: ");
            String newPhone = sc.nextLine();

            contacts.put(name, newPhone);

            System.out.println("Phone number updated.");
            System.out.println("New Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }

        sc.close();
    }
}