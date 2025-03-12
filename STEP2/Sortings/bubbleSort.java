package STEP2.Sortings;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        int n = arr.length;
        boolean swaped = false;
        for (int i = 0; i < n; i++) {
            // it'll run till n - i times
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap the max num with neighbour
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    // check if the arr is sorted
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
