package com.foundation;

import javax.swing.*;

public class DecisionStructure_ifElse
{
    public static void main(String[] args)
    {
       /*
        int p;
        String input;

        input = JOptionPane.showInputDialog("Enter a number:");
        p = Integer.parseInt(input);

        if (p==5)
        {
            JOptionPane.showMessageDialog(null, "Number is Exactly Five!");
        }
        else if (p>10)
        {
            JOptionPane.showMessageDialog(null, "Number is Greater than 10!");
        }
        else if (p>5)
        {
            JOptionPane.showMessageDialog(null, "Number is Greater than 5!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Number is Less than 5!");
        }
        */

        int marks;
        String input;
        input = JOptionPane.showInputDialog("Enter Marks:");
        marks = Integer.parseInt(input);

        if(marks < 50  && marks >= 45)
        {
            JOptionPane.showMessageDialog(null, "You can write re-assesment");
        }
        else if (marks < 45 )
        {
            JOptionPane.showMessageDialog(null, "You  failed!");
        }
        else
        {
            if(marks>=75)
            {
                JOptionPane.showMessageDialog(null, "You have Distinction");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You Passed");
            }
        }
        System.exit(0);
    }
}
