package com.foundation;

import java.util.Scanner;

public class readingInput
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("Enter First Number:");
        num1 = obj.nextInt();
        System.out.println("Enter Second Number:");
        num2 = obj.nextInt();

        double average;
        average = (num1+num2)/2.0;
        System.out.println("Average:" + average);

        String firstName;
        String surName;

        obj.nextLine();
        System.out.println("Enter your name:");
        firstName = obj.nextLine();
        System.out.println("Enter your surname:");
        surName = obj.nextLine();
        System.out.println("Full Name:" + firstName + " " + surName);
    }
}
