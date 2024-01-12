package com.foundation;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingToFiles
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("OutputFile.txt");

        if(file.exists())
        {
            Scanner inputFile = new Scanner(file);
            while(inputFile.hasNext())
            {
                System.out.println(inputFile.nextLine());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "File not exist!");
        }
    }
}
