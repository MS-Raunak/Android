package com.java.loop;

import java.util.Scanner;

public class seriesAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series:"); //0-1+2-3+4-5 => -3-7-5 = -15
        int n = sc.nextInt();
        int ans=0;

        for(int i=1; i<=n; i++){
            if(n%2==0){
                ans+=i;
            }
            else {
                ans-=i;
            }
        }
        System.out.println(ans);

    }
}
