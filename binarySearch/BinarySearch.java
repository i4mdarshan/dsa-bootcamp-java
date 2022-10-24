import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Sorted array
        System.out.println("Enter no of array elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = Integer.parseInt(sc.next());
        }
        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        System.out.println(target + " lies on " + binarySearch(arr, target) + " index.");
    }
}