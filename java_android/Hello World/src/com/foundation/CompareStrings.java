package com.foundation;

import javax.swing.*;

public class CompareStrings
{
    public static void main(String[] args)
    {
        String name1 = JOptionPane.showInputDialog("Enetr the first name:");
        String name2 = JOptionPane.showInputDialog("Enter the second name:");

       /*
        if(name1.equals(name2))
        {
            JOptionPane.showMessageDialog(null, "first name is equal to the second name");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not equal to!");
        }

        */

        if (name1.compareTo(name2)==0)
        {
            JOptionPane.showMessageDialog(null, "first name is the equal to second name");
        }
        else if (name1.compareTo(name2) < 0 )
        {
            JOptionPane.showMessageDialog(null, "name1 is first name and name2 is second name");
        }
        else if (name1.compareTo(name2) > 0 )
        {
            JOptionPane.showMessageDialog(null, "name2 is first name and name1 is second name");
        }

        /*
        String s1 = "Ram";
        String s2 = "Ram";
        if(s1 == s2)
        {
            JOptionPane.showMessageDialog(null, "Equal");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Equal");
        }

         */



        System.exit(0);

    }
}
