package com.java.loop;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int n=0;

        do{
            System.out.print(n);
            if(n<num){
                System.out.print(",");
            }
            n++;
        }while (n<=num);
    }
}
