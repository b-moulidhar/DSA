package com.questions;

public class EvenElements {
    public static void main(String[] args) {
        int[] arr = {123,432, 2321, 3435, 2874, 232, 32, 54, 9, 20,7,24,46,47};
        int ans = evenelem(arr);
        System.out.println("number of even Elements = "+ans);
    }
    static int evenelem(int[] nums){
        if (nums.length==0){
            return -1;
        }
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
}
