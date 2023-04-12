package array;

import java.util.*;

public class EvenPositionElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array present on even position:");
        for (int i = 1; i < n; i += 2) {
            System.out.println(arr[i]);
        }
    }
}