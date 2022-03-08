package com.syntax.class19;

import java.util.Scanner;

public class TesterWithScanner {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            String omit = word.replaceAll("[^aeiouAEIOU]", "");
            System.out.println(omit);
        }
}
