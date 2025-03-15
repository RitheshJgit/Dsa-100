package STEP3.Easy;

import org.w3c.dom.ls.LSOutput;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        // it will return in boolean
        System.out.println( isSorted(arr) ? "Array Sorted" : "Array isn't Sorted");
    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // check for the sorted array
            if(arr[i] > arr[i + 1]){
               return false;
            }
        }
        return true;
    }
}
