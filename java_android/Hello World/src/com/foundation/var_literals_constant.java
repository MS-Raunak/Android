package com.foundation;

public class var_literals_constant
{
    public static void main(String[] args) {
        int firstNumber ;
        int secondNumber;
        firstNumber = 10;
        secondNumber =11;

         double average;
//         average = (double) (firstNumber+secondNumber)/2; // 10.5
        average = (firstNumber+secondNumber)/2.0; // 10.5
        System.out.println("Average:" + average);

        String firstName = "John";
        String surName= "done";

        System.out.println("Full Name: " + firstName + " " + surName);

        boolean value ;
        value = false;
        System.out.println("Boolean Value: " + value);

        char letter;
        letter = 'l';


    }
}
