package com.questions;

public class MaxWealth {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = maxWealth(arr);
        System.out.println(ans);
    }
    static int maxWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int personSum = 0;
            for (int accnt = 0; accnt < accounts[person].length; accnt++) {
                personSum+=accounts[person][accnt];
            }
            if(personSum>ans){
                ans=personSum;
            }
        }
        return ans;
    }
}
