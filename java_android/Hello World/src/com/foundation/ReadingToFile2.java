package com.foundation;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingToFile2
{
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int count = 0;
        double average;
        File file = new File("OutputFile1.txt");
        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext())
            {
                sum += inputFile.nextInt();
                count++;
            }
            inputFile.close();

            average = sum / (double) count;
            JOptionPane.showMessageDialog(null, "Number of digit: " +
                    count + "\n" + "Sum: " + sum + "\n" + "Average: " + average);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "File not exist!");
        }
    }
}
