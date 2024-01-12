package com.java.loop;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int numberOfDigit = 0;
        int num= n;

        while (n>0){
            n = n/10;
            numberOfDigit++; // count the digit of n number
        }
        System.out.println("Number of digit in "+num +": " + numberOfDigit);
    }
}
