class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String n, int year, String addr) {
        name = n;
        yearOfJoining = year;
        address = addr;
    }

    public void displayInfo() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        System.out.println("Name\t\tYear of Joining\tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
