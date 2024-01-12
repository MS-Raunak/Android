package com.foundation;

import javax.swing.*;

public class SwitchStatement
{
    public static void main(String[] args) {
        int number;
        String input;

        input = JOptionPane.showInputDialog("Enter number 1,2,3");
        number = Integer.parseInt(input);
        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "You entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "you entered 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "You entered 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You did not enter 1, 2 or 3!");
        }

        char letter;
        String input1;
        input1 = JOptionPane.showInputDialog("Enter a, b or c");
        letter = input1.charAt(0);
        switch (letter)
        {
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null, "you entered a!");
                break;

            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, " you entered b!");
                break;

            case 'C':
            case  'c':
                JOptionPane.showMessageDialog(null, " you entered c!");
                break;

            default:
                JOptionPane.showMessageDialog(null, " you did not entered a,b or c!");
        }

        System.exit(0);

    }
}
