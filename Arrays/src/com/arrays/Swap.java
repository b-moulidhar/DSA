package com.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,23,45,67,89};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] narr, int idx1, int idx2){
        int temp = narr[idx1];
        narr[idx1] = narr[idx2];
        narr[idx2] = temp;

    }
}
