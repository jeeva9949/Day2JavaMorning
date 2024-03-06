import java.util.Scanner;

public class CheckSquareOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double Length = scanner.nextDouble();
        double Breadth = scanner.nextDouble();
        scanner.close();

        if (Length == Breadth){
            System.out.println("It is a Square");
        }else{
            System.out.println("Not a Square");
        }
    }
}
