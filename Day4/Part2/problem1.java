import java.util.Scanner;

class Employee {
    String name;
    double salary;
    String dateOfJoining;

    public Employee(String n, double s, String doj) {
        name = n;
        salary = s;
        dateOfJoining = doj;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\tSalary: " + salary + "\tDate of Joining: " + dateOfJoining);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character
            System.out.print("Enter date of joining for employee " + (i + 1) + ": ");
            String doj = scanner.nextLine();

            employees[i] = new Employee(name, salary, doj);
        }

        System.out.println("\nEmployee Information:");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
