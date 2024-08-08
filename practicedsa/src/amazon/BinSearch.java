package amazon;

import java.util.Arrays;

public class BinSearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(7));
    }

    public static int binarySearch(int target) {
        int arr[] = {5, 8, 1, 2, 3, 7, 9, 15, 18, 4};
        Arrays.sort(arr);
        for (int a : arr) {
            // System.out.println(a);
        }
        int index = -1;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }
}