import java.util.Scanner;

public class fibo {
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a);

        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();
        printFibonacciSeries(numberOfTerms);
        
        scanner.close();
    }
}
