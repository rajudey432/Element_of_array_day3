package array;

import java.util.*;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (frequencyMap.containsKey(key)) {
                int frequency = frequencyMap.get(key);
                frequencyMap.put(key, frequency + 1);
            } else {
                frequencyMap.put(key, 1);
            }
        }
        System.out.println("Frequency of each element in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(key + " occurs " + frequency + " times");
        }
    }
}