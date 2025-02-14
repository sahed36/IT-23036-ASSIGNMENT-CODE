import java.util.Scanner;

public class FactorionFinder {
    // Precompute factorials of digits 0-9
    private static final int[] FACTORIALS = new int[10];
    
    static {
        FACTORIALS[0] = 1;
        for (int i = 1; i < 10; i++) {
            FACTORIALS[i] = i * FACTORIALS[i - 1];
        }
    }
    
    // Method to check if a number is a factorion
    private static boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += FACTORIALS[digit];
            temp /= 10;
        }
        return sum == num;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input for range
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Factorion numbers in the range:");
        boolean found = false;
        
        for (int i = lower; i <= upper; i++) {
            if (isFactorion(i)) {
                System.out.print((found ? ", " : "") + i);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("None");
        }
    }
}
