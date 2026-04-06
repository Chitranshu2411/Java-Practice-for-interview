import java.util.*;

public class floorNumber {

    public static int floor(int[] arr, int target) {

        if (arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        // agar target sabse chhota hai
        if (target < arr[0]) return -1;

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

        // yahan end hi floor index hoga
        return arr[end];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = floor(arr, target);

        if (result == -1) {
            System.out.println("No floor found");
        } else {
            System.out.println("Floor is: " + result);
        }

        sc.close();
    }
}