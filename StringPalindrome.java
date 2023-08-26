public class StringPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("assa"));
        System.out.println(isPalindrome("assaawa"));
        System.out.println(isPalindrome("ashfui"));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseWord(str));
    }

    public static String reverseWord(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseWord(str.substring(0, str.length() - 1));
    }
}
