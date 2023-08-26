public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(89));
        System.out.println(isPalindrome(124430));
        System.out.println(isPalindrome(12321));

    }

    public static boolean isPalindrome(int num) {
        int newNum = num;
        System.out.println(newNum);
        StringBuilder oppositeNum = new StringBuilder();
        while (newNum > 0) {
            int rem = newNum % 10;
            newNum /= 10;
            oppositeNum.append(rem);
        }
        return num == Integer.parseInt(String.valueOf(oppositeNum));
    }
}
