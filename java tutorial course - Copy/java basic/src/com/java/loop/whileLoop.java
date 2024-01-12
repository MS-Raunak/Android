package com.java.loop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        int n=1;
        while(n<=num){
            System.out.println(n);
            n++;
        }
    }
}
