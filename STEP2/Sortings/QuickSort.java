package STEP2.Sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // assign the array
        int[] arr = {3, 2, 4, 5, 1};
        quickSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSortArr(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if( low < high){
            // get the pivot element
            int piovt = partion(arr, low, high);
            // find the pivot for left side
            quickSort(arr, low, piovt-1);
            // find for the right side
            quickSort(arr, piovt+1, high);
        }
    }

    public static int partion(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){
            // increment the i if arr[i] < pivot
            while (arr[i] <= pivot && i < high){
                i++;
            }

            // decrement the j if arr[j] > pivot
            while (arr[j] > pivot && j > low){
                j--;
            }

            // swap the both indies
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }

        // sort the pivot at the crt index

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

}
