package com.foundation;

public class CopyArrays
{
    public static void main(String[] args) {
        int [] array1 = {2,4,6,8,9};

//        int [] array2 = array1;

//        printArray(array1);
//        System.out.println();
//        printArray(array2);
//
        int [] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = array2[i];
        }

        printArray(array1);
        System.out.println();
        printArray(array2);
    }
    public static void printArray(int [] array)
    {
        for (int val: array)
        {
            System.out.println(val);
        }
    }

}
