package com.syntax.class16;

import java.util.Arrays;

public class StringArrayWithSplit {
    public static void main(String[] args) {
        String s = "This is a sentence";

        String[] strArr=s.split(" ");
        System.out.println(Arrays.toString(strArr));

        String s2= "This is a sentence. Batch 12 is great." +
                "Edward is not great. He is super great.";
        String[] strArr2=s2.split("[.]"); //this allows to split into array based on certain chars
        System.out.println(strArr2.length);
        System.out.println(strArr2[3]); //prints the 3rd part of the array specified by split char
        System.out.println(strArr2[3].trim()); //the TRIM cuts the space at the beginning off

    }
}
