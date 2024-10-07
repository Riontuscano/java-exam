import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SortVectorDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the vector
        System.out.print("Enter the number of elements in the vector: ");
        int size = scanner.nextInt();
        Vector<Integer> vector = new Vector<>(size);

        System.out.println("Enter elements of the vector:");
        for (int i = 0; i < size; i++) {
            vector.add(scanner.nextInt());
        }

        // Sort the vector in descending order
        Collections.sort(vector, Collections.reverseOrder());

        // Display the sorted vector
        System.out.println("Sorted Vector in Descending Order: " + vector);

        scanner.close();
    }
}