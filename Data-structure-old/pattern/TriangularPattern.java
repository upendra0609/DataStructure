package com.sikku;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        pattern4(n);
    }

    public static void pattern1(int n) {
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(j++ +" ");
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern2(int n) {
        int i=1;
        while (i<=n){
            int j=1;
            int star = i;
            while (j<=i){
                System.out.print(star++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern3(int n) {
        int i=1;
        int star = 1;
        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print(star++ +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void pattern4(int n) {
        int i=1;
        while (i<=n){
        char ch  = (char) ('A'+ i -1);
            int j=1;
            while (j<=i){
                System.out.print(ch +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
