import java.util.Scanner;

public class CharacterChecker {
    // Method to count letters, whitespace, and digits
    public static void countCharacters(char[] arr) {
        int letters = 0, whitespaces = 0, digits = 0;
        
        for (char ch : arr) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isWhitespace(ch)) {
                whitespaces++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }
        
        System.out.println("Letters: " + letters);
        System.out.println("Whitespace: " + whitespaces);
        System.out.println("Digits: " + digits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        scanner.close();
        
        // Convert string to character array and pass to method
        countCharacters(input.toCharArray());
    }
}
