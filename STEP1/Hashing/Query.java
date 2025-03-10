package STEP1.Hashing;

import java.util.Arrays;

public class Query {
    public static void main(String[] args) {
        int[] query = {1, 3, 4, 2, 10};
        int[] given_arr = {1, 2, 1, 3, 2};
        // Ans - 21020
        HashingMethod(query, given_arr);
    }

    // using frequency method
    public static void HashingMethod(int[] query, int[] given_arr) {
        // Arrays.stream(query).max().getAsInt() + 1
        /* to elaborate this
        first - > get arr length , then get max as int type;
        last -> store in any integer
         */

        // Assign the max element + 1 as arr length
        int[] hashArr = new int[Arrays.stream(query).max().getAsInt() + 1];

        for (int i = 0; i < given_arr.length; i++) {
            hashArr[given_arr[i]] += 1;
        }
        display(hashArr);

    }

    public static void hashing1(int[] query, int[] given_arr) {
        int[] hashTable = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            for (int j = 0; j < query.length; j++) {
                // if element find in the given_arr
                // increment the particular element
                if (query[i] == given_arr[j]) {
                    hashTable[i] += 1;
                }
            }
        }
        // printing the hash table in prettier way
        for (int i = 0; i < query.length; i++) {
            System.out.println(query[i] + "  ---->   " + hashTable[i]);
        }
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
