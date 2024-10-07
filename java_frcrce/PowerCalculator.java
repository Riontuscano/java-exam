import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the base number and the exponent
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using a loop
        long result = 1;  // Use long to handle large results
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
