package com.foundation;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles2
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter OutputFile = new PrintWriter("OutputFile1.txt");

        int num;
        String input = JOptionPane.showInputDialog("Enter the maximum length of series");
        num = Integer.parseInt(input);

        int i = 5;
        while(i<=num)
        {
            OutputFile.println(i);
            i=i+5;
        }
         OutputFile.close();
    }
}
