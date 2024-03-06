import java.util.Scanner;

public class convertFahrenheitIntoCelsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double FahrenheitValue = scanner.nextDouble();
        scanner.close();
        double celsius =(FahrenheitValue-32)*5/9;
        System.out.println("celsius " + celsius);
    }
}
