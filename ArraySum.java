import java.util.Scanner;

public class ArraySum {
    // Method to calculate the sum of elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        // Prompt user to enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Call the calculateSum method and store the result
        int totalSum = calculateSum(numbers);
        
        // Print the result
        System.out.println("The sum of the array elements is: " + totalSum);
    }
}
