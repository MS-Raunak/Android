package com.foundation;

public class Methods
{
    public static void main(String[] args)
    {
        System.out.println("this is main() method..");

        printAverage(20, 30);
        double average = getAverage(25,35);
        System.out.println("Average: " + average);
        String fullName = getFullName("John", "Donne");
        System.out.println("Full Name: " + fullName);

        int value = 10;
        if(isValid(value))
        {
            System.out.println("Number is in range between 1 to 100");
        }
        else
        {
            System.out.println("Number is not in range between 1 to 100");
        }
    }

    public  static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2)/2.0;
        System.out.println("Average: " + average);
    }

    public  static double getAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
                return average;
    }

    public  static String getFullName(String name, String surName)
    {
       // String fullName = name + " " +surName;
       // return fullName;
        return name + " " + surName;
    }

    public  static boolean isValid(int number)
    {
        /* boolean status;
        if(number > 1 && number < 100)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;

         */

//        shorthand method
        return  (number > 1 && number <100);
    }
}
