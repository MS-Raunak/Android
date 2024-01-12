package com.java.loop;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class pyramid {                                 //        : : : : *
    public static void main(String[] args) {           //        : : : * * *
        Scanner sc = new Scanner(System.in);           //        : : * * * * *
        System.out.println("Enter the number of row:");//        : * * * * * * *
        int r = sc.nextInt();                          //        * * * * * * * * *
        int i,j,k;
        for (i=1; i<=r; i++){
            for (j=1; j<(r-i); j++){
                System.out.print(" ");
            }
            for (k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
