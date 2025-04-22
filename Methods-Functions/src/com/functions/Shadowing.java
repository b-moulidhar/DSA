package com.functions;

public class Shadowing {
//    the variable with higher level scope is hidden
    static int x = 100; //this will be shadowed @ line 8
    public static void main(String[] args) {
        System.out.println(x); //prints 100
        int x= 50;
        System.out.println(x); //prints 50
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
