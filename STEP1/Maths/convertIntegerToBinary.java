package STEP1.Maths;

public class convertIntegerToBinary {
    public static void main(String[] args) {
        String binary = "";
        int number = 5;
        System.out.println("Converted Binary is : " + convertIntegerToBinary(binary,number));
    }

    public static String convertIntegerToBinary(String binary, int num){

        while (num > 0){
            binary = (num % 2) + binary;

            num = num / 2;
        }
        return binary;
    }
}
