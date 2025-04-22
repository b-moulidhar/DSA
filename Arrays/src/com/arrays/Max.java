package com.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,23,45,67,89};
        System.out.println(max(arr));
    }
    static int max(int[] narr){
        int max=0;
        for (int nar = 0; nar < narr.length; nar++) {
            if(narr[nar]>max){
                max= narr[nar];
            }
        }
        return max;
    }
}
