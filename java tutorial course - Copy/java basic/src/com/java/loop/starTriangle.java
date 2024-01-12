package com.java.loop;

import java.util.Scanner;
public class starTriangle {                                 //   *          Print like this triangle
    public static void main(String[] args) {               //    * *
        Scanner sc = new Scanner(System.in);              //     * * *
         int i,j,r;                                       //     * * * *
        System.out.println("Enter the number of row:");    //    * * * * *
        r=sc.nextInt();

        for (i=1; i<=r; i++){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
