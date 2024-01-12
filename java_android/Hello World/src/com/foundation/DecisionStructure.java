package com.foundation;

public class DecisionStructure
{
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int p = 7;

        boolean expression;
        expression = x > y ; //false
        expression = x < y ; // true
        expression = x < y && y > p; //false
        expression = x < y && y < p; //true
        expression = x < y || y > p; // true
        expression = !(x < y);

        System.out.println(expression);
    }
}
