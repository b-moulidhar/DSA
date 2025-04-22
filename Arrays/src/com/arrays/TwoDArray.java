package com.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
//        enhanced for loop
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.println(arr[row][col]);
//            }
//        }
    }
}
