package com.search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,3,2,3,223,-123,3445,234,421,-243,-124, 123};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value to search");
        int search = in.nextInt();
        int ans = linearSearch(nums,search);
        if (ans==-1){
            System.out.println("not found, error code "+ans);
        }else{
            System.out.println("found at index"+ans);
        }
    }
//    search the array.
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
