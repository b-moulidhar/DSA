package com.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -14, -5, 5, 3, 4, 15, 17, 19, 22};
        int[] arr1 = {18, 14, 5, -5, -3, -4, -15, -17, -19, -22};
        int ans = orderAgnosticBS(arr1,-15);
        System.out.println(ans);
    }
    static  int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
//        find if array is sorted as ascending or descending;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end) {
//            int mid = start+end/2; //possibility where start + end might exceed the integer range.
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
