package STEP2.Sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 7, 1, 4};
        MergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void MergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;

            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }

    }


}
