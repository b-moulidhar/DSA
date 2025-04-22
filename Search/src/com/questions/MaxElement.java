package com.questions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 5, 7},
                {234,123,12,90},
                {324,1234,56,234},
                {43,57,132421}
        };
//        boolean ans = search2dArr(arr,search);
        int ans = maxElem(arr);
        System.out.println("Max Element in 2D array is "+ ans);
    }
    static int maxElem(int[][] nums){
        if (nums.length ==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
