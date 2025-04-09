package STEP3.Hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n3Times {
    public static void main(String[] args) {
            int[] nums = {3,2,3};
        List<Integer>list = majorityElement(nums);
        System.out.println(list);
    }

    public static List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }

        int element = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // add in list if element > n / 3
            if(count > nums.length/3 && !list.contains(element)){
                list.add(element);
            }

            // increment the count if same
            if(element == nums[i]){
                count ++;
            } else if (element != nums[i]) {
                count = 1;
                element = nums[i];
            }
        }

        if(count > nums.length/3 && !list.contains(element)){
            list.add(element);
        }

        return list;
    }
}