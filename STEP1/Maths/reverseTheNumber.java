package STEP1.Maths;

public class reverseTheNumber {
    public static void main(String[] args) {
        reverseTheNumber();
    }
    public static void reverseTheNumber(){
        int x = 124;
        int sum = 0;

        while(x > 0){
            // get the last num
            int rem = x % 10;

            // store the last value at first
            sum = sum * 10 + rem;

            // reduce one digit
            x /= 10;
        }

        System.out.println(sum);
    }
}
