package com.loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String name = in.next();
//        enhanced switch
        switch (name.toLowerCase()) {
            case "mango" -> System.out.println("Typed name is " + name);
            case "apple" -> System.out.println("typed name is " + name);
            case "orange" -> System.out.println("round fruit");
            default -> System.out.println("other names typed");
        }
    }
}
