package com.syntax.class16;

public class ReplaceRangesInString {
    public static void main(String[] args) {
        String str="!#@%#$%@#23434346209-897ASGSDFHHadgdfg";
        System.out.println(str.replaceAll("[0-9]", "OoO")); //replaces a range of chars with something else specified
        System.out.println(str.replaceAll("[A-z]", "poop")); //the ranges are based on the ASCII table
        System.out.println(str.replaceAll("[A-Za-z0-9]", "l")); //replacing multiple ranges

    }
}
