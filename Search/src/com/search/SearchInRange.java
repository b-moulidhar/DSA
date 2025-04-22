package com.search;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,4,3,2,3,223,-123,3445,234,421,-243,-124, 123};
        System.out.println("Enter a value to search");
        int search = in.nextInt();
        int ans = searchInRange(nums,4,14, search);
        if (ans==-1){
            System.out.println("not found, error code "+ans);
        }else{
            System.out.println("found at index"+ans);
        }
    }
    static int searchInRange(int[] arr,int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
