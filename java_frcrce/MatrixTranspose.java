import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Declare the matrix
        int[][] matrix = new int[rows][cols];

        // Input the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();  // Close the scanner
    }
}
