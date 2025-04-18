package com.loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String val = in.next();
        switch (id){
            case 1 -> {
                switch (val){
                case "random" -> System.out.println("Hello random");
                case "random3" -> System.out.println("Hello random3");
                case "random5" -> System.out.println("Hello random4");
                default -> System.out.println("no data found");
            }
            }
            case 2 -> System.out.println("value "+id);
            default -> System.out.println("wrong id entered");
        }
    }
}
