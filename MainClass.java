// BaseClass: Provides a method to print results.
class BaseClass {
    // Method to print results
    public void printResult(String result) {
        System.out.println(result);
    }
}

// SumClass: Computes the sum of the series: 1 + 0.9 + 0.8 + ... + 0.1
class SumClass extends BaseClass {
    public void calculateSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        printResult("Sum of the series: " + sum);
    }
}

// DivisorMultipleClass: Finds the GCD and LCM of two numbers.
class DivisorMultipleClass extends BaseClass {
    // Method to compute GCD
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM
    public int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public void computeGCDLCM(int a, int b) {
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);
        printResult("GCD: " + gcd + ", LCM: " + lcm);
    }
}

// NumberConversionClass: Converts numbers between Binary, Decimal, Hexadecimal, and Octal.
class NumberConversionClass extends BaseClass {
    // Method to convert Decimal to Binary
    public String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    // Method to convert Decimal to Hexadecimal
    public String decimalToHexadecimal(int num) {
        return Integer.toHexString(num);
    }

    // Method to convert Decimal to Octal
    public String decimalToOctal(int num) {
        return Integer.toOctalString(num);
    }

    public void convertNumbers(int num) {
        String binary = decimalToBinary(num);
        String hex = decimalToHexadecimal(num);
        String octal = decimalToOctal(num);
        printResult("Decimal: " + num + " => Binary: " + binary + ", Hexadecimal: " + hex + ", Octal: " + octal);
    }
}

// CustomPrintClass: Implements a pr() method for formatted printing.
class CustomPrintClass extends BaseClass {
    public void pr(String message) {
        System.out.println("Formatted Output: " + message);
    }
}

// MainClass: Creates objects and calls methods from all classes.
public class MainClass {
    public static void main(String[] args) {
        // SumClass instance and method call
        SumClass sumClass = new SumClass();
        sumClass.calculateSum();

        // DivisorMultipleClass instance and method call
        DivisorMultipleClass divisorMultipleClass = new DivisorMultipleClass();
        divisorMultipleClass.computeGCDLCM(24, 36);

        // NumberConversionClass instance and method call
        NumberConversionClass numberConversionClass = new NumberConversionClass();
        numberConversionClass.convertNumbers(255);

        // CustomPrintClass instance and method call
        CustomPrintClass customPrintClass = new CustomPrintClass();
        customPrintClass.pr("This is a custom formatted message.");
    }
}
