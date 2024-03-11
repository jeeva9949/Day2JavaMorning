import java.util.Scanner;

class Student {
    int rollNumber;
    double[] marks = new double[3];

    public Student(int roll) {
        rollNumber = roll;
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of students " + rollNumber + ":");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter subject marks " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < 8; i++) {
            students[i] = new Student(i + 1);
            students[i].inputMarks();
        }

        System.out.println("\nStudent Roll Number and Average Marks:");
        for (Student student : students) {
            System.out.println("Roll Number is : " + student.rollNumber + "\tAverage Marks is : " + student.calculateAverage());
        }
    }
}
