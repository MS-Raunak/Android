package com.java.loop;

import java.util.Scanner;

public class powerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int ans=1;

        for(int i=1; i<=b; i++){
            ans*=a;
        }
        System.out.println("Power of " +a+"^"+b +"=" +ans);
    }

}
