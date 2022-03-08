package com.syntax.class16;

import java.util.Scanner;

public class SplitCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter names");
        String input = scan.nextLine();
        String[] names = new String[5];

        for (int i=0; i<=3; i++) {
            System.out.println(names[i]);
        }
    }
}
