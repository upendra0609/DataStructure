public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(24));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(45));

    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            sum += num % i == 0 ? i : 0;
        }
        return sum == num;
    }
}
