package com.foundation;

import javax.swing.*;

public class ReadJOptionPane
{
    public static void main(String[] args)
    {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Enter your name:");
        surname = JOptionPane.showInputDialog("Enter your surname");

        JOptionPane.showMessageDialog(null,  name + " " + surname);

        int firstNumber;
        int secondNumber;
        String input;

        input = JOptionPane.showInputDialog("Enter First Number:");
        firstNumber = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter Second Number:");
        secondNumber = Integer.parseInt(input);

        double average;
        average = (firstNumber + secondNumber)/2.0;
        JOptionPane.showMessageDialog(null, "Average:" + average);


    }
}
