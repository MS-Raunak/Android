package com.foundation;

public class CompareArray
{
    public static void main(String[] args) {
        int [] number1 = {1,2,4,6,8};
        int [] number2 = {1,2,4,6,8};

        boolean arrayEqual = true;
        int i = 0;

        if(number1.length != number2.length)
        {
            arrayEqual = false;
            System.out.println("Size of array does not matched!");
        }
        while (arrayEqual && i < number1.length)
        {
            if (number1[i] != number2[i])
            {
                arrayEqual = false;
                System.out.println("Element does not matched!");
            }
            i++;
        }
        if(arrayEqual)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not same!");
        }
    }
}
