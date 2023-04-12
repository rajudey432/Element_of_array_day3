package array;

import java.util.*;

public class ReverseOrderOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}