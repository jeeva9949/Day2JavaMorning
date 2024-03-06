import java.util.Scanner;

public class AttendencePercatnge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of classes Hold");
        int NoOfClasses = scanner.nextInt();

        System.out.println("Enter the no of Classes You Attended");
        int NoOfAttended = scanner.nextInt();


        double AttendedPerctange = (double) NoOfAttended/NoOfClasses *100;

        if (AttendedPerctange>=75){
            System.out.println("Student is allowed to sit in class");
        }else {
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);

            if(medicalCause == 'Y' || medicalCause == 'y'){
                System.out.println("Student is allowed to sit due to Medical certificate");
            }else{
                System.out.println("student is not to Exam due not having Medical Certificate");
            }
        }
        scanner.close();

    }
}
