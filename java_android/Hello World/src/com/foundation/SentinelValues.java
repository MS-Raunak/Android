package com.foundation;

import javax.swing.*;

public class SentinelValues
{
    public static void main(String[] args) {
        int val;
        int doubleValue;

        String input = JOptionPane.showInputDialog("Enter the value for doubled (0 to stop)");
        val = Integer.parseInt(input);

        while (val != 0)
        {
            doubleValue = val * 2;
            JOptionPane.showMessageDialog(null,  "Double(" + val + "): " + doubleValue );

            input = JOptionPane.showInputDialog("Enter the value for doubled (0 to stop)");
            val = Integer.parseInt(input);
        }
    }
}
