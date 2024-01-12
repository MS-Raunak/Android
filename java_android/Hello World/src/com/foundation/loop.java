package com.foundation;



public class loop
{
    public static void main(String[] args)
    {
        //while loop

        int i=0;   // control loop
        while (i<5) // Pre test
        {
            System.out.println("Hello World!");
            i++;
        }
        System.out.println();


        //do while loop
        int j=0; //control loop

        do {                      //post check
            System.out.println("Hello World!");
            j++;
        }while (j<5);
        System.out.println();

        // for loop

        for (int k=0; k<5; k++)  // pre test
        {
            System.out.println("Hello World!");
        }
    }
}
