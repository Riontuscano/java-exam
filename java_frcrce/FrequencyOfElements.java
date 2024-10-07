import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
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

        // Find and display the frequency of each element
        findFrequency(array);

        scanner.close();
    }

    // Method to find and display the frequency of each element
    public static void findFrequency(int[] array) {
        // Use a HashMap to store the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
    