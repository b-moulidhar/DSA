package com.functions;

import java.util.Arrays;

public class Arguments {
    public static void main(String[] args) {
        fun(1,2,3,4,5,5,6,6,6,7,8,9,0);
    }
    static void fun(int ...r){
        System.out.println(Arrays.toString(r));
    }
}

