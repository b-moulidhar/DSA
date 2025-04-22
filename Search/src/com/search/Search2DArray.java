package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 5, 7},
                {234,123,12,90},
                {324,1234,56,234},
                {43,57}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value to search");
        int search = in.nextInt();
//        boolean ans = search2dArr(arr,search);
        int[] ans = search2dArr(arr,search);
        System.out.println("Found at position "+Arrays.toString(ans));
//        System.out.println(ans);
    }
    static int[] search2dArr(int[][] nums, int target){
        if (nums.length ==0){
            return new int[] {-1,-1};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target){
                    return new int[] {i,j};
                }
            }

        }
        return new int[] {-1,-1} ;
    }
//    static boolean search2dArr(int[][] nums, int target){
//        if (nums.length ==0){
//            return false;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                if (nums[i][j] == target){
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }
}
