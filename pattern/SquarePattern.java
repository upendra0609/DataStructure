package com.sikku;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        pattern4(n);
    }

    public static void pattern1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < n) {
                j++;
                System.out.print(i+" ");
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern2(int n){
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern3(int n){
        int i = 1;
        while (i <= n) {
            int j = n;
            while (j > 0) {
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern4(int n){
        int i = 0;
        while (i < n) {
            int j = 1;
            char ch = (char) ('A' + i);
            while (j <= n) {
                System.out.print(ch++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern5(int n){
        int i = 0;
        while (i < n) {
            int j = 1;
            char ch = 'A';
            while (j <= n) {
                System.out.print(ch++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
