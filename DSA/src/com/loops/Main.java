package com.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
//        print numbers from 1 to n;

//        for loop
//        for (int i=1;i<=num;i++){
//            System.out.print(" "+i);
//        }

//        while loop
        int n = 1;
//        while (n<=num){
//            System.out.print(" "+n);
//                    n+=1;
//        }

//        do-while loop
        do {
            System.out.println(" "+n);
            n++;
        }while (n<=num);
    }
}
