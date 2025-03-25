package STEP3.Medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

public class nextPermutaion {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};

        // The permutations in lexicographical order:
        //  123 → 132 → 213 → 231 → 312 → 321
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 2, 3]
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int index1 = -1; // To find the first decreasing element from the right
        int index2 = -1; // To find the next greater element to swap

        // Step 1: Find the first decreasing element from the right
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }

        // If no such index is found, the array is in descending order (last permutation)
        if (index1 == -1) {
            reverse(nums, 0);
            return; // Return after reversing
        }

        // Step 2: Find the next greater element from the right
        for (int i = nums.length - 1; i > index1; i--) {
            if (nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }

        // Step 3: Swap the found elements
        swap(nums, index1, index2);

        // Step 4: Reverse the suffix to get the next smallest lexicographical order
        reverse(nums, index1 + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
