
import java.util.Scanner;
public class CheckNumberPresentOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] NewArray = new int[10];
        System.out.println("Enter 10  numbers");
        for (int i=0;i<10;i++){
            int Element = scanner.nextInt();
            NewArray[i]= Element;

        }
        System.out.println("Enter Number to search");
        int TargetElement = scanner.nextInt();
        scanner.close();

        boolean isPresent = false;

        for(int j:NewArray){
            if (TargetElement == j){
                isPresent = true;
                break;
            }
            else{
                isPresent = false;
            }
        }
        if(isPresent){
            System.out.println("Number is Present");
        }else{
            System.out.println("Not Present");
        }
    }
}
