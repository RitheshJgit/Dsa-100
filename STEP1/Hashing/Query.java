package STEP1.Hashing;

public class Query {
    public static void main(String[] args) {
        int[] query = {1, 3, 4, 2, 10};
        int[] given_arr = {1, 2, 1, 3, 2};
        // Ans - 21020
        hashing(query, given_arr);
    }

    // using frequency method

    public static void hashing(int[] query, int[] given_arr){
        int[] hashTable = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            for (int j = 0; j < query.length; j++) {
                // if element find in the given_arr
                // increment the particular element
                if(query[i] == given_arr[j]){
                    hashTable[i] += 1;
                }
            }
        }
        // printing the hash table in prettier way
        for (int i = 0; i < query.length; i++) {
            System.out.println(query[i] +"  ---->   " + hashTable[i]);
        }
    }
}
