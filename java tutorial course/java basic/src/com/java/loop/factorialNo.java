package com.java.loop;

import java.util.Scanner;

public class factorialNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:"); // 5!= 5*4*3*2*1 =120
        int n = sc.nextInt();
        int fact =1;

        for(int i=n; i>0; i--){
            fact = fact*i;
        }
        System.out.println("Factorial of " + n + ": "+ fact);
    }
}
