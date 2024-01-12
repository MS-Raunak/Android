package com.java.condition;

import java.util.Scanner;

public class ladderIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Consider the marks of a Student");
        System.out.println("Enter Physics Marks:");
        int p = sc.nextInt();
        System.out.println("Enter Physics Marks:");
        int c = sc.nextInt();
        System.out.println("Enter Chemistry Marks:");
        int m = sc.nextInt();

        int total = p+c+m;
        System.out.println("Total Marks:"+total);
        int per = total/3;
        System.out.println("Percentage:"+ per);

        if(per>=60 && per<=100){
//            System.out.println("First division:");
            if(per>=75 && per<=100){
                System.out.println("First Division With distinct");
            }
        }
        else if(per>=45 && per<60){
            System.out.println("Second division:");
        }
        else if(per>=30 && per<45){
            System.out.println("third division:");
        }
        else {
            System.out.println("Fail");
        }
    }
}
