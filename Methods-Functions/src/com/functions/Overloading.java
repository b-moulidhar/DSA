package com.functions;

public class Overloading {
    // function name is same but has different argument,
    // can also be of same type but should no of parameters should be different
    // this done at compile time
    public static void main(String[] args) {
        fun(45);
        fun("hello");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
}
