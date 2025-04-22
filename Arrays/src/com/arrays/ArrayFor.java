package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {
        int[] arr;
        Scanner in = new Scanner(System.in);
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        enhance for loop
        for (int j : arr) {
            System.out.print(j+" ");
        }
//        System.out.println(Arrays.toString(arr));
    }
}
