import java.util.Scanner;

public class GCDUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

    
        int gcd = findGCD(num1, num2);
        
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;  
    }
}

