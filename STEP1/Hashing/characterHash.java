package STEP1.Hashing;

public class characterHash {
    public static void main(String[] args) {
        String s = "zyxw";
        solveInHash(s);
    }

    public static void solveInHash(String s) {

        // change string into char arr
        char[] sChar = s.toCharArray();

        // create character array in the length od alphabet
        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alpha[sChar[i] - 'a'] += 1;
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.println((char) ('a' + i) + "->" + alpha[i] + " ");
        }
    }
}
