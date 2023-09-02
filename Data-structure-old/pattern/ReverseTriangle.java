package com.sikku;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
//        pattern2(n);
//        invertPattern1(n);
//        triangle(n);
        triangleStar(n);
    }


    public static void pattern1(int n) {
        int i = 1;
        while (i <= n) {
            //blank
            int blank = n - i;
            while (blank > 0) {
                System.out.print(" ");
                blank--;
            }
            //star
            int star = i;
            while (star > 0) {
                System.out.print("*");
                star--;
            }

            System.out.println();
            i++;
        }
    }
    public static void pattern2(int n) {
        int i = 1;
        while (i <= n) {
            //blank
            int blank = n - i;
            while (blank > 0) {
                System.out.print(" ");
                blank--;
            }
            //star
            int star = i;
            int count = 1;
            while (star > 0) {
                System.out.print(count++);
                star--;
            }

            System.out.println();
            i++;
        }
    }
    public static void invertPattern(int n) {
        int i = n;
        while (i > 0) {

            //star
            int star = i;
            while (star > 0) {
                System.out.print("*");
                star--;
            }

            System.out.println();
            i--;
        }
    }
    public static void invertPattern1(int n) {
        int i = n;
        int count = 1;
        while (i > 0) {
            int star = i;
            while (star > 0) {
                System.out.print(count);
                star--;
            }

            System.out.println();
            i--;
            count++;
        }
    }
    public static void triangle(int n) {
        int i = 1;
        while (i <= n) {
            //space
            int space = n - i;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }

            //number1
            int j = i;
            int num = 1;
            while (j > 0) {
                System.out.print(num++ + " ");
                j--;
            }

            //num2
            j = i - 1;
            while (j > 0) {
                System.out.print(j-- + " ");
            }

            System.out.println();
            i++;
        }
    }
    public static void triangleStar(int n) {
        int i = 1;
        while (i <= n) {
            //space
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            //star
            int star = 2 * i - 1;
            while (star > 0) {
                System.out.print("*");
                star--;
            }
            System.out.println();
            i++;
        }
    }
}
