package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
        System.out.println("enter the operator");
        char op = in.next().trim().charAt(0);
            if(op=='+' || op == '-' || op=='*' || op =='/' || op=='%' ){
                System.out.println("enter first number");
                int n1 = in.nextInt();
                System.out.println("enter second number");
                int n2 = in.nextInt();
                if (op=='+'){
                    ans = n1+n2;
                }if (op=='-'){
                    ans = n1-n2;
                }if (op=='*'){
                    ans = n1*n2;
                }if (op=='/'){
                    if(n2!=0){
                        ans = n1 /n2;
                    }
                }if (op=='%'){
                    ans = n1%n2;
                }

            } else if (op == 'x'|| op == 'X') {
                break;
            }else{
                System.out.println("invalid operator");
            }
        System.out.println("answer is "+ans);
        }
    }
}
