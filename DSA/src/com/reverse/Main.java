package com.reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        int reverse = 0;
        while (n>0){
            int temp = n%10;
            reverse = reverse * 10 + temp;
            n/=10;
        }
        System.out.println(reverse);
    }
}
