package com.java.loop;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary_num = sc.nextInt();
        int ans = 0;  // converted decimal number
        int pow = 1; //2^0 =1 power of 2
        int bn = binary_num; // local variable

        while (binary_num>0){
            int unit_digit = binary_num % 10;
            ans+= (unit_digit * pow);
            binary_num/=10;
            pow*=2;
        }
        System.out.println("Decimal of " + bn + ":" + ans);
    }
}
