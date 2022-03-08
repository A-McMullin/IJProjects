package com.syntax.class16;

import java.util.Scanner;

public class PrintOtherLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        char[] obj = word.toCharArray();

        for (int i=0; i<word.length(); i+=2) {
            System.out.print(word.charAt(i));
        }
    }
}
