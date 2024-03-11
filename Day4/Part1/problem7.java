class Employee {
    double salary;
    int hoursOfWork;

    public void getInfo(double sal, int hours) {
        salary = sal;
        hoursOfWork = hours;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo(450, 7);
        employee.addSal();
        employee.addWork();
        employee.printFinalSalary();
    }
}
