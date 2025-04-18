package com.demo;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = (int)(45.675f);
//        System.out.println(num);
//         byte a = 40;
//         byte b = 50;
//         byte c = 100;
//         int d  = a*b/c;
//        System.out.println(d);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f= 5.67f;
        double d= 2.31244;
        double res = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) +" "+ (i/c)+" " + (d*s));
        System.out.println(res);
    }
}
