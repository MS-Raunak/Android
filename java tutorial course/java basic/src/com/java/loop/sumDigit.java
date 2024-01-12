package com.java.loop;

import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int num= n;

        while (n>0){
            n = n/10;
            sum = sum +n%10;
        }
        System.out.println("Sum of digit of "+num +": " + sum);
    }
}
