package com.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,23,45,67,89};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] nArr){
        int start = 0;
        int end = nArr.length-1;
        while (start<end){
            int temp = nArr[start];
            nArr[start] = nArr[end];
            nArr[end] = temp;
            start++;
            end--;
        }
    }
}
