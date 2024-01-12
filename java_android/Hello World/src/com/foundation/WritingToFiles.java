package com.foundation;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles
{
    public static void main(String[] args) throws IOException
    {
        // create the file and open the file
        // if file exists it will replace the file
        PrintWriter OutputFile = new PrintWriter("OutputFile.txt");
                OutputFile.println("This is line1!");
                OutputFile.println("This is line2!");
                OutputFile.println("This is line3!");
                OutputFile.println("This is line4!");

                OutputFile.close();
    }
}
