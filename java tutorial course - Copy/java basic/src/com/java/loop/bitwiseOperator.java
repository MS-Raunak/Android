package com.java.loop;

import java.util.Scanner;

public class bitwiseOperator {
    public static void main(String[] args) {
        int p =9;
        int q=10;

//        bitwise OR(|)
        System.out.println(p | q);   // 11

//        bitwise AND(&)
        System.out.println(p & q);   // 8

//        bitwise exclusive OR or XoR(^)
        System.out.println(p ^ q);   // 3

//        bitwise Left Shift Operator(<<)
        System.out.println(p << 1);  // 18

//        bitwise Right Shift Operator(>>)
        System.out.println(q >> 1);  // 5


    }
}
