package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiAl = new ArrayList<>(10);
        for (int i = 0; i < 3; i++) {
        multiAl.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiAl.get(i).add(in.nextInt());
            }
        }
        System.out.println(multiAl);
    }
}
