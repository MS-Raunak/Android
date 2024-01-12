package com.foundation;

import javax.swing.*;

public class userControlLoop
{
    public static void main(String[] args) {
        int max_number;
        String input = JOptionPane.showInputDialog("Enter the maximum number");
        max_number = Integer.parseInt(input);

        System.out.println("Number          Number Squared");
        System.out.println("===============================");

        for (int number = 1; number <= max_number; number++)
        {
            System.out.println(number+ "\t\t\t\t" + number*number);
        }
        System.exit(0);
    }
}
