public class ArmstrongNumber {
        public static void main(String[] args) {
            System.out.println("Armstrong numbers between 100 and 500 are:");

            for (int number = 100; number <= 500; number++) {
                int originalNumber = number;
                int result = 0;

                while (originalNumber != 0) {
                    int digit = originalNumber % 10;
                    result += Math.pow(digit, 3);
                    originalNumber /= 10;
                }

                if (result == number) {
                    System.out.println(number);
                }
            }
        }
    }
