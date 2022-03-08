package com.syntax.class16;

public class Class162 {

    public static void main(String[] args) {

        String str = "Let's say you wanted to print a line with lots of words, Habababah";
        System.out.println(str.charAt(5));
        System.out.println(str.length()); //counts the number of chars in string
        System.out.println(str.charAt(str.length()/2)); //counts the length of the string then prints the char
                                                        //at the end less the equation following
        System.out.println("#####################################");
        System.out.println(str.indexOf("h")); //prints the index of the first occurrence of the char specified
        //System.out.println(str.lastIndexOf(ch: 'a'));
        System.out.println(str.substring(str.indexOf("p"))); //prints remainder of string after first char listed
        System.out.println(str.substring(str.indexOf("i")+1,str.indexOf("i")+1+11));
    }
}
