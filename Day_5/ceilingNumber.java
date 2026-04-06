import java.util.*;

public class ceilingNumber {

    // function to find ceiling
    public static int ceiling(int[] arr, int target) {

        if (arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        // agar target sabse bada hai
        if (target > arr[end]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return arr[mid]; // exact match
            }
        }

        // yahan start hi ceiling index hoga
        return arr[start];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input elements (sorted)
        System.out.println("Enter elements (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = ceiling(arr, target);

        // output
        if (result == -1) {
            System.out.println("No ceiling found");
        } else {
            System.out.println("Ceiling is: " + result);
        }

        sc.close();
    }
}