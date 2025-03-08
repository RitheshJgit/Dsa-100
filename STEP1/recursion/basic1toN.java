package STEP1.recursion;

public class basic1toN {
    public static void main(String[] args) {
        fromNto1_BackTrack(1);
    }

    public static void callRecursion(int n){
        if(n == 0){
            return;
        }
        callRecursion(n-1);
        System.out.println(n);
    }

    public static void callRecursionInReverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        callRecursionInReverse(n-1);
    }

    public static void name5time(int n){
        if (n == 0) {
            return;
        }
        name5time(n-1);
        System.out.println("Username");

    }

    public static void from1toN(int i, int n){
        if (i > n) {
            return;
        }
        System.out.println(i);
        from1toN(i+1, n);
    }

    public static void fromNto1(int i, int n){
        if (i <= n) {
            return;
        }
        System.out.println(i);
        fromNto1(i-1, n);
    }

    public static void from1toN_BackTrack(int i){
        if (i < 1) {
            return;
        }

        from1toN_BackTrack(i-1);
        System.out.println(i);
    }

    public static void fromNto1_BackTrack(int i){
        if (i > 10) {
            return;
        }

        fromNto1_BackTrack(i+1);
        System.out.println(i);
    }

}
