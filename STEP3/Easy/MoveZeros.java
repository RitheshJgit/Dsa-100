package STEP3.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Optimized(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Optimized(int[] nums) {
        // Initialise j = -1
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // if the nums contain non-zero
        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < nums.length; i++) {
            // stop the i at non-zero element
            if(nums[i] != 0){
                // swap i and j
                swap(nums, i, j);
                j++;
            }
        }

    }

    public static int[] BruteForce(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < list.size()) {
                arr[i] = list.get(i);
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void moveZeros(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            // stop the i in 0
            if (nums[i] == 0) {
                // stop the j in any non-zero index
                while (nums[j] == 0 && j < nums.length - 1) {
                    j++;
                }
            }
            // swap both
            swap(nums, i, j);
            i++;
            j++;
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
