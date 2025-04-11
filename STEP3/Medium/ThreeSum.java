package STEP3.Medium;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        threeSum(nums);
    }

    public static List<List<Integer>> OptimalApproach(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // ignore the duplicate values
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k){
                // get the sum
                int sum = nums[i] + nums[j] + nums[k];

                // check if sum < 0
                if(sum < 0){
                    j++;
                } else if (sum > 0) {
                    k--;
                }
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.add(temp);
                    j++; k --;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                }
            }

        }
        return list;
    }

    public static List<List<Integer>> BetterApproach(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> map = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                // check the elements in the between the map
                if(map.contains(third)){

                    // create the list add all three elements
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    // sort the elements
                    Collections.sort(temp);

                    // check for the duplicates
                    if(!list.contains(temp)){
                        list.add(temp);
                    }
                }
                map.add(nums[j]);
            }
        }
        return list;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int j = 1;
        // create a List
        List<List<Integer>> list = new ArrayList<>();
        // sort the numbers first
        Arrays.sort(nums);
        boolean isFound = false;

        while (j < nums.length) {

            for (int k = j + 1; k < nums.length; k++) {
                // check for the sum of Zero
                if (nums[i] + nums[j] + nums[k] == 0) {
                    // create temp list to store in the list to avoid duplicates
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    Collections.sort(temp);

                    // check if the element already exists
                    if (!list.contains(temp)) {
                        list.add(temp);
                        isFound = true;
                    }
                }
            }

            if (!isFound) {
                for (int k = j + 1; k < nums.length; k++) {
                    // check for the sum of Zero
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // create temp list to store in the list to avoid duplicates
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(temp);

                        // check if the element already exists
                        if (!list.contains(temp)) {
                            list.add(temp);
                            isFound = false;
                        }
                    }
                }

            }
            i++;
            j++;
        }
        System.out.println(list);

        return list;
    }
}