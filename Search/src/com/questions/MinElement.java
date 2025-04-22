package com.questions;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {123,432, 2321, 3435, 2874, 232, 32, 54, 9, 20,7};
        int ans = minElement(arr);
        System.out.println("Minimum element is "+ans);
    }
    static int minElement(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int minEle = nums[0];
        for(int i : nums){
            if (minEle > i){
                minEle = i;
            }
        }
        return minEle;
    }
}
