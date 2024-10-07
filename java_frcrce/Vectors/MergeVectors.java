import java.util.Vector;
import java.util.Scanner;

public class MergeVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first vector
        System.out.print("Enter the number of elements in the first vector: ");
        int size1 = scanner.nextInt();
        Vector<Integer> vector1 = new Vector<>(size1);

        System.out.println("Enter elements of the first vector:");
        for (int i = 0; i < size1; i++) {
            vector1.add(scanner.nextInt());
        }

        // Input for the second vector
        System.out.print("Enter the number of elements in the second vector: ");
        int size2 = scanner.nextInt();
        Vector<Integer> vector2 = new Vector<>(size2);

        System.out.println("Enter elements of the second vector:");
        for (int i = 0; i < size2; i++) {
            vector2.add(scanner.nextInt());
        }

        // Merging the vectors
        Vector<Integer> mergedVector = mergeVectors(vector1, vector2);

        // Displaying the merged vector
        System.out.println("Merged Vector: " + mergedVector);

        scanner.close();
    }

    // Method to merge two vectors
    public static Vector<Integer> mergeVectors(Vector<Integer> vector1, Vector<Integer> vector2) {
        Vector<Integer> mergedVector = new Vector<>(vector1);
        mergedVector.addAll(vector2); // Add all elements from vector2
        return mergedVector;
    }
}
