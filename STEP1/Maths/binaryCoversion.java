package STEP1.Maths;

public class binaryCoversion {
    public static void main(String[] args) {
        // input : 10-5-4 output : 1010-101-100
        String binary= "10-5-4";
        String answer = findBinary(binary);
        System.out.println(answer);
    }

    public static String findBinary(String binary){
        String ans = "";
        char[] cString = binary.toCharArray();
        String range = "";
        for (int i = 0; i < cString.length; i++) {
            if(cString[i] == '-'){
                ans += convertInteger(range) + "-";
                range = "";
            }
            else {
                range += cString[i];
            }
        }

        return ans;
    }

    public static String convertInteger(String binary){
        int num = Integer.parseInt(binary);
        while (num > 0){
            binary = (num % 2) + binary;

            num = num / 2;
        }
        return binary;
    }
}
