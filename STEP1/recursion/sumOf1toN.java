package STEP1.recursion;

public class sumOf1toN {
    static int sum = 0;
    public static void main(String[] args) {
        sumOfNumbers(10);
        System.out.println(sum);
    }

    public static int sumOfNumbers(int n){
        if (n == 0) {
            return 10;
        }
        sum += n;
        return sumOfNumbers(n-1);
//        sum -= n - 1;
//        System.out.println(sum);
    }

    public static void sum(int n){
        if(n == 0){
            return;
        }


    }
}
