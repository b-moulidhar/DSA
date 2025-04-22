package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String val = in.next();
        arguments(val,5);
//        System.out.println("sum 2 is "+sum2());
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;
        System.out.println("enter first number");
         n1 = in.nextInt();
        System.out.println("enter second number");
         n2 = in.nextInt();
         sum = n1 + n2 ;
        System.out.println("the sum is "+sum);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;
        System.out.println("enter first number in s2");
         n1 = in.nextInt();
        System.out.println("enter second number in s2");
         n2 = in.nextInt();
         sum = n1 + n2 ;
         return sum;
    }
     static void arguments(String name, int val){
         System.out.println("Hello Mr " + name+ ", Hope you are doing good");
         System.out.println("your token number is " + val);
     }
}
