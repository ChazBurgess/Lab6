
import java.util.Scanner;

public class IsPrimeMethod {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");
        number = keyboard.nextInt();
        boolean primeNumber = isPrimeNumber(number);
        if (primeNumber == false){
            System.out.println(number + " is not a prime number.");
        }else{
            System.out.println(number + " is a prime number!");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
