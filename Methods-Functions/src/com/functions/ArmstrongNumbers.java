package com.functions;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter a value");
//        int num = in.nextInt();
//        boolean ans = Armstrong(num);
//        System.out.println("is the entered number Arm strong number: "+ans);
        for (int i = 100; i < 1000; i++) {
            if(Armstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean Armstrong(int n){
        int org = n;
        int sum =0 ;
        while(n>0){
            int temp = n%10;
            n=n/10;
            sum += temp*temp*temp;
        }
        return sum==org;
    }
}
