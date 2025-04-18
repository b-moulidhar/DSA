package com.occurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        while(n>0){
            int rem = n%10;
//            occurrences of 3
            if(rem == 3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
