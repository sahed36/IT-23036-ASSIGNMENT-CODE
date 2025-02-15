import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for the first number
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompt the user for the second number
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform calculations
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;

            // Print the results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

            // Handle division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double quotient = (double) num1 / num2;
                System.out.println("Quotient: " + quotient);
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
