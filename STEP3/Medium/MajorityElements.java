package STEP3.Medium;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int nums : arr){
           map.put(nums, 0);
       }
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            }
        }

        int majorityElement = 0;
        int occurence_finder = 0;
        for (int i = 0; i < arr.length; i++) {
            if(majorityElement < map.get(arr[i])){
                majorityElement = map.get(arr[i]);
                occurence_finder = arr[i];
            }
        }
        System.out.println(occurence_finder);
    }
}
