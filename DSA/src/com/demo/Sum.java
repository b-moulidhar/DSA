package com.demo;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first value");
        int a = input.nextInt();
        System.out.println("enter second value");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Sum is "+c);
    }
}
