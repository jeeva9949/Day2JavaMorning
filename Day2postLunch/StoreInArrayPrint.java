import java.util.Scanner;

public class StoreInArrayPrint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] NewArray = new int[10];
        System.out.println("Enter 10  numbers");
        for (int i=0;i<10;i++){
            int Element = scanner.nextInt();
            NewArray[i]= Element;

        }
        scanner.close();
        for(int j:NewArray){
            System.out.println(j);
        }
    }
}
