package com.questions;

public class EvenDigits {
    public static void main(String[] args) {
    int[] arr = {123,432, 2321, 3435, 2874, 232, 32, 54, 9, 20,7,24,46,47,234567};
    int ans = findnums(arr);
    System.out.println("number of even Elements = "+ans);
}
//using remainder method
static int findnums(int[] arr){
        int count=0;
        for(int n:arr){
            if(even(n)){
                count++;
            }
        }
        return count;
}
static boolean even(int num){
    int nDigi = digits(num);
    return nDigi % 2 == 0;
}
static int digits(int num){
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        use Math.log
    if (num<0){
            num*=-1;
        }
    return (int)Math.log10(num)+1;
//    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//        int count = 0;
//        if (num<0){
//            num*=-1;
//        } else if (num==0) {
//            return 1;
//        }
//    while (num>0){
//            count++;
//            num/=10;
//        }
//        return count;
}

//----------------------------------------------------------------------------------------------
// using String conversion

//    static int evendigit(int[] nums){
//        if (nums.length==0){
//            return -1;
//        }
//        int count =0;
//        for (int i = 0; i < nums.length; i++) {
//            String val = nums[i]+""; //convert to string and take count
//            if(val.length()%2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }
}
