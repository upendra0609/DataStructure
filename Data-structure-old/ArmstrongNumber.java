public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(0));
        System.out.println(isArmstrong(1));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(15));
    }

    public static int noOfDigit(int num) {
        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit++;
        }
        return digit;
    }

    public static boolean isArmstrong(int num) {
        int digit = noOfDigit(num);
        int newNum = num;
        double sum = 0;
        while (newNum > 0) {
            sum += Math.pow(newNum % 10, digit);
            newNum /= 10;
        }
        return sum == num;
    }
}

