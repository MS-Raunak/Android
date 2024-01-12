package com.java.loop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i,table;
        for (i=1; i<=10; i++){
            table = n*i;
            System.out.print(table + " ");
        }
    }
}
