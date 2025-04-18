package com.conditions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your salary?");
        int salary = input.nextInt();
        if(salary > 45000){
            salary = salary + 2000;
        } else if (salary > 30000 && salary <45000) {
            salary+=1500;
        } else{
            salary+= 1000;
        }
        System.out.println("your total salary after bonus is "+salary);
    }
}
