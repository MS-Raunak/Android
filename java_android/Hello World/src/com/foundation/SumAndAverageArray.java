package com.foundation;

public class SumAndAverageArray
{
    public static void main(String[] args)
    {
        int [] values = {2,4,6};
        int sum =0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        double average = (double) sum / values.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: "+ average);


    }
}
