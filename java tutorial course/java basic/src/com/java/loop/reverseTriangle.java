package com.java.loop;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int r = sc.nextInt();
        int i,j;
        for (i=r; i>=1; i--){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
