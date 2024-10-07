import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input the array elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates from the array
        int[] uniqueArray = removeDuplicates(array);

        // Display the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        scanner.close();
    }

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num); // HashSet does not allow duplicates
        }

        // Convert the set back to an array
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }

        return resultArray;
    }
}
        