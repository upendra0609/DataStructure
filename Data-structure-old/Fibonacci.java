public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(1));
        System.out.println(getFibonacci(2));
        System.out.println(getFibonacci(3));
        System.out.println(getFibonacci(4));
        System.out.println(getFibonacci(5));
        System.out.println(getFibonacci(6));
        System.out.println(getFibonacci(7));
        System.out.println(getFibonacci(8));
        System.out.println(getFibonacci(9));
        System.out.println(getFibonacci(10));

    }

    public static int getFibonacci(int position) {

        if (position <= 1) {
            return 0;
        } else if (position == 2 || position == 3) {
            return 1;
        }

        return getFibonacci(position - 2) + getFibonacci(position - 1);
    }

}
