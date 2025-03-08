package STEP1.recursion;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String reverse = convert(s);
        StringBuilder sb = new StringBuilder(reverse).reverse();
        return reverse.equals(sb.toString());
    }

    public static String convert(String s){
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isLetterOrDigit(ch[i])){
                sb.append(Character.toLowerCase(ch[i]));
            }
        }

        return sb.toString();
    }
}
