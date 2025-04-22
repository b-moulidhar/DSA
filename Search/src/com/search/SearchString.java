package com.search;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String name = "Mouli";
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string value");
        String tar = in.next();
        char target = tar.charAt(0);
        boolean ans = searchString(name,target);
        System.out.println(ans);
    }
    static boolean searchString(String str, char target){
        if(str.length()==0){
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//             if(target == str.charAt(i)){
//                 return true;
//             }
//        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
