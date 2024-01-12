package com.foundation;

public class StringArrays
{
    public static void main(String[] args)
    {

    String [] names = getNames();
        for (int i = 0; i < names.length; i++)
        {
//            System.out.println(names[i]); // display all name

            if(names[i] != null)
            {
                System.out.println(names[i].charAt(0)); // display first letter of all name
            }
        }

    }

    public static String [] getNames()
    {
        String [] names = new String[6];

        names[0] = "Peter";
        names[1] = "David";
        names[2] = "Harray";
        names[3] = "John";
        names[4] = "Johnson";
        names[5] = "Albert";
        return names;

    }
}
