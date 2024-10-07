import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to binary and print it
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);

        scanner.close();
    }
}
