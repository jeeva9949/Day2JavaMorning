import java.util.ArrayList;
import java.util.Scanner;

class DirectoryEntry {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;
    String uniqueID;

    public DirectoryEntry(String n, String addr, String tel, String mobile, String head, String id) {
        name = n;
        address = addr;
        telephoneNumber = tel;
        mobileNumber = mobile;
        headOfFamily = head;
        uniqueID = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DirectoryEntry> directory = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter unique ID: ");
                    String uniqueID = scanner.nextLine();

                    DirectoryEntry entry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    directory.add(entry);
                    System.out.println("Database entry created successfully!");
                    break;

                case 2:
                    System.out.print("Enter unique ID to edit entry: ");
                    String editID = scanner.nextLine();
                    boolean found = false;
                    for (DirectoryEntry dirEntry : directory) {
                        if (dirEntry.uniqueID.equals(editID)) {
                            dirEntry.displayInfo();
                            System.out.println("\nEnter updated information:");
                            System.out.print("Updated name: ");
                            dirEntry.name = scanner.nextLine();
                            System.out.print("Updated address: ");
                            dirEntry.address = scanner.nextLine();
                            System.out.print("Updated telephone number: ");
                            dirEntry.telephoneNumber = scanner.nextLine();
                            System.out.print("Updated mobile number: ");
                            dirEntry.mobileNumber = scanner.nextLine();
                            System.out.print("Updated head of family: ");
                            dirEntry.headOfFamily = scanner.nextLine();
                            System.out.println("Entry updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Entry with unique ID '" + editID + "' not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine().toLowerCase();
                    boolean keywordFound = false;
                    for (DirectoryEntry dirEntry : directory) {
                        if (dirEntry.name.toLowerCase().contains(keyword) ||
                                dirEntry.address.toLowerCase().contains(keyword) ||
                                dirEntry.telephoneNumber.toLowerCase().contains(keyword) ||
                                dirEntry.mobileNumber.toLowerCase().contains(keyword) ||
                                dirEntry.headOfFamily.toLowerCase().contains(keyword) ||
                                dirEntry.uniqueID.toLowerCase().contains(keyword)) {
                            dirEntry.displayInfo();
                            keywordFound = true;
                        }
                    }
                    if (!keywordFound) {
                        System.out.println("No matching entries found for the keyword '" + keyword + "'");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
