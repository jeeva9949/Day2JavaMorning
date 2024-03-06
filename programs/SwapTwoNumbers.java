public class SwapTwoNumbers {
    public static void main(String[] args){
        int firstNumber = 10;
        int SecondNumber = 20;

        int ThirdVaribale = firstNumber;
        firstNumber = SecondNumber;
        SecondNumber = ThirdVaribale;

        System.out.println("firstNumber "+ firstNumber );
        System.out.println("SecondNumber "+ SecondNumber);
    }
}
