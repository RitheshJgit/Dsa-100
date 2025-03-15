package STEP3.Easy;


import java.util.Arrays;

public class secondLargestNum {
    public static void main(String[] args) {
        int[] arr = {45, 1, 6, 3, 2, 3, 4, 5};
        BruteForce(arr);
        Optimal(arr);
    }

    public static void Optimal(int[] arr) {
        // check for edge cases
        if (arr.length < 2) {
            System.out.println("Array should contain least two elements");
        }

        // assign first and second-largest number
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                // pass the first to second
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
    }
    public static void BruteForce(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
    public static int findMax(int[] arr, int index) {
        // initialise max and index
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            // find the max num
            if (max < arr[i]) {
                max = arr[i];
                // get the index of max element
                index = i;
            }
        }

        return index;
    }
}
