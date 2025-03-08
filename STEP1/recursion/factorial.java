package STEP1.recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(Recursion(5));
    }

    public static int Recursion(int n){
        if(n == 1){
            return 1;
        }

        return n * Recursion(n-1);
    }

    public static void factorial(int n){
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
