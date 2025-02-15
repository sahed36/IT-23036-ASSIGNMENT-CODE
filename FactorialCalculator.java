import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
    // Method to calculate factorial using BigInteger
    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating factorial
        BigInteger fact = factorial(number);

        // Displaying the result
        System.out.println("Factorial of " + number + " is: " + fact);
        
        scanner.close();
    }
}
