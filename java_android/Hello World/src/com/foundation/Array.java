package com.foundation;

public class Array
{
    public static void main(String[] args) {
        int [] numbers = new int[5];


        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 14;
        numbers[3] = 12;
        numbers[4] = 19;
        System.out.println(numbers[0]);  // 10
        System.out.println(numbers[3]);  // 12

        System.out.println();  // add new line

       int number2[] = {20,25,30,45,24,29};
       for(int i = 0;  i < number2.length; i++)
       {
           System.out.println("number2[" + i +"] : " + number2[i]);
       }

        System.out.println();

       for (int val:number2)
       {
           System.out.println(val);
       }

    }
}
