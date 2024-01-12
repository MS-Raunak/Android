package com.java.loop;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");   //23456
        int n = sc.nextInt();
         int reverse = 0;
         int num =n;
         while(n>0){
             int k = n%10;
             reverse = reverse*10 + k;
             n=n/10;
         }
        System.out.println("Reverse of" + num + ": " + reverse);
    }
}
