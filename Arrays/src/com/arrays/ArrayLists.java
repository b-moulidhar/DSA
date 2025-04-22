package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        System.out.println("enter 5 numbers");
//        list.add(12);
//        list.add(24);
//        list.add(243);
//        list.add(5343);
//        list.add(6433);
//        list.add(12);
//        list.add(24);
//        list.add(243);
//        list.add(5343);
//        list.add(6433);
//        list.add(12);
        //set the integer at a particular index
//        list.set(0,45);

//        boolean has = list.contains(5443);
        //remove element
//        list.remove(3);
//        System.out.print(list+" "+has);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
    }
}
