package STEP1.Maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 234;

        int ans = countDigits(n);
        System.out.println(ans);
    }

    public static int countDigits(int n){
        // Assign count variable to count the digits
        int count = 0;

        // while loop
        while(n > 0){
            // count the digits
            count++;
            // remove one element from n [234] - remove 4
            n /= 10;
        }

        return count;
    }
}
