package STEP3.Medium;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 10, 11};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // get the remaining element
            int b_Element = target - nums[i];

            // check for the existence
            if (map.containsKey(b_Element)) {
             return new int[] {map.get(b_Element)};
            }

            // if not add added in the resume
            map.put(nums[i], i) ;
        }
        return new int[] {-1,-1};
    }


    public static void greedy(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int complement = nums[left] + nums[right];

            if(complement == target){
                return;
            }

            else if (complement < target){
                left++;
            }
            else {
                right++;
            }
        }

        return;
    }

}
