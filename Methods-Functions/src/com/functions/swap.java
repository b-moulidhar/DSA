package com.functions;

public class swap {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=20;
        swap(a,b);
        System.out.println(a+ " "+b);
    }
    static void swap(int a,int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a+ " "+b);
    }
}
