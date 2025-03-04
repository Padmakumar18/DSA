import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 10, 20, 30, 50, 60, 70, 100, 110, 180 };
        int target = 10;
        System.out.println(exponentialSearch(arr, arr.length, target));
    }

    public static int exponentialSearch(int[] arr, int len, int target) {
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (i < len && arr[i] <= target) {
            i = i * 2;
        }
        return Arrays.binarySearch(arr, i / 2, Math.min(i, len), target);
    }
}