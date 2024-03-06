import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int SubOne = scanner.nextInt();
       int SubTwo = scanner.nextInt();
       int SubThree = scanner.nextInt();

       scanner.close();

       int TotalMarks = SubOne + SubTwo +SubThree;
       double percentageMarks = (double) TotalMarks / 300 * 100;

       System.out.println("total marks " + TotalMarks);
       System.out.println("percentage " + percentageMarks);
    }
}
