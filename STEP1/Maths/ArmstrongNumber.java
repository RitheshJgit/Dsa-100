package STEP1.Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
       boolean isArm =  ArmstrongNumber(153);
        System.out.println(isArm);
    }

    public static boolean ArmstrongNumber(int n){
        int digits = (int)(Math.log10(n)) + 1; // get the no.of digits
        int num = n; // copy the original number
        int sum = 0;
        while (n > 0) {
            // take last num
            int rem = n % 10;

            // it multiplies according to the power the digit count
            sum +=(int)( Math.pow(rem, digits));

            // remove the last element
            n /= 10;
        }

        // check if both are equal
        return sum == num;
    }
}
