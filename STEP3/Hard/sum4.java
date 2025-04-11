package STEP3.Hard;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sum4 {
    public static void main(String[] args) {
        int[] nums = {
                2,2,2,2,2
        };
        int target = 8;

        fourSum(nums, target);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            List<Integer> temp = Arrays.asList(nums[i] ,nums[j] , nums[k] , nums[l]);
                            Collections.sort(temp);
                            if(!list.contains(temp)){
                                list.add(temp);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(list);

        return list;
    }
}
