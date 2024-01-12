package com.foundation;

public class HighestAndLower
{
    public static void main(String[] args)
    {
        int [] array = {2,5,3,8,17,9,1};

        int highest = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] > highest)
            {
                highest = array[i];
            }
        }
        System.out.println("Highest value is: "+ highest);

        int lowest = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] < lowest)
            {
                lowest = array[i];
            }
        }
        System.out.println("Highest value is: "+ lowest);

    }
}
