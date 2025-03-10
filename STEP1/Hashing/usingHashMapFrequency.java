package STEP1.Hashing;

import java.util.HashMap;

public class usingHashMapFrequency {
    public static void main(String[] args) {
        int[] query = {1, 3, 4, 2, 10};
        int[] given_arr = {1, 2, 1, 3, 2};
        findInHash(given_arr);
    }

    public static void findInHash(int[] given_arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <given_arr.length-1; i++) {
            if(map.containsKey(given_arr[i])){

            }
        }
    }
}
