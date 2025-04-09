package STEP3.Hard;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
        int[] nums = {
                -1,0,1,2,-1,-4
        };

        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums){
        int index = 0;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(i != j && i != k && j != k && nums[i] + nums [j] + nums[k] == 0){
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(temp);
                        if(!list.contains(temp))
                        {
                            list.add(new ArrayList<>());
                            list.get(index).add(nums[i]);
                            list.get(index).add(nums[j]);
                            list.get(index).add(nums[k]);

                            index ++;
                        }
                    }
                }
            }


        }
        System.out.println(list);

        return list;
    }
}


