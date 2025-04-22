package com.functions;

public class Scopes {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//        block scope
        {
            int c =40;
            a=20;
            System.out.println(c);
        }
        int c= 100;
//        System.out.println(c); c cannot be accessed here

//        loops scope
        for(int i=0;i<10;i++){
            int d =40;
        }

//    function scope
//        System.out.println(marks);  marks cannot be used here
//        System.out.println(nums);  nums cannot be used here
    }
    static void random(int nums){
        int marks =86;
        System.out.println(marks);
        System.out.println(nums);
    }
}
