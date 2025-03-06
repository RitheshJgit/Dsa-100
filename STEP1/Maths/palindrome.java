package STEP1.Maths;

public class palindrome {
    public static void main(String[] args) {
        int num = 121;
        isPalindrome(num);
    }

    public static boolean isPalindrome1(int x) {
        int copyx = x;
        int sum = 0;
        while(x > 0){
            // get the last num
            int rem = x % 10;

            // store the last value at first
            sum = sum * 10 + rem;

            // reduce one digit
            x /= 10;
        }

        return copyx == sum;
    }

    public static boolean isPalindrome(int x){
        String str = Integer.toString(x);
        char[] ch = str.toCharArray();
        // using two pointer  start - s and end - e
        int s = 0;
        int e = ch.length-1;
        while(s < e){
            if(ch[s] != ch[e]){
                return false;
            }
            s++; e--;
        }

        return true;
    }

}
