class Student {
    String name;
    int roll_no;

    Student(String n, int roll) {
        name = n;
        roll_no = roll;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 2);
        Student student2 = new Student("Sam", 0);

        System.out.println("Student 1: Roll No - " + student1.roll_no);
        System.out.println("Student 2: Roll No - " + student2.roll_no);
    }
}
