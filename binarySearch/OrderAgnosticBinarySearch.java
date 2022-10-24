import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    static int binarySearch(Integer[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Sorted array
        System.out.println("Enter no of array elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        Integer [] arr = new Integer[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = Integer.parseInt(sc.next());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array : " + Arrays.toString(arr));
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        System.out.println(target + " lies on " + binarySearch(arr, target) + " index.");
    }
}
