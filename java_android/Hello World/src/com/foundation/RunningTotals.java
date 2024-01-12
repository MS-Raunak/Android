package com.foundation;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals
{
    public static void main(String[] args) {
        int day;
        double sales;
        double totalSales = 0.0;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        String input = JOptionPane.showInputDialog("Enter the number of days:");
        day = Integer.parseInt(input);

        for (int count = 1; count <= day; count++)
        {
            input = JOptionPane.showInputDialog("Enter sales for the day" + count);
           sales = Double.parseDouble(input);
            totalSales += sales;
        }
        JOptionPane.showMessageDialog(null, "Total Sales: $" + dollar.format(totalSales));

        System.exit(0);
    }
}
