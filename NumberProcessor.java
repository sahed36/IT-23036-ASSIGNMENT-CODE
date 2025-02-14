import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (Scanner scanner = new Scanner(new File(inputFile));
             PrintWriter writer = new PrintWriter(new File(outputFile))) {
            
            scanner.useDelimiter(",\s*"); // Handle comma and optional spaces
            List<Integer> numbers = new ArrayList<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            
            // Find the highest number
            int maxNumber = Collections.max(numbers);
            
            // Calculate the sum of natural numbers up to maxNumber
            long sum = (long) maxNumber * (maxNumber + 1) / 2;
            
            // Write results to output file
            writer.println(maxNumber + ", " + sum);
            System.out.println("Output written to " + outputFile);
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        }
    }
}