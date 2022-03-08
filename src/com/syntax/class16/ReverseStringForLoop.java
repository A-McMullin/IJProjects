package com.syntax.class16;


import java.util.Scanner;

public class ReverseStringForLoop {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        char[] rev= s.toCharArray();

        for (int i=rev.length-1; i>=0; i--) {
            System.out.print(rev[i]);
        }
    }
}