package com.syntax.class24;

public class FinalTester {

    final void reverse(String input){
        StringBuilder str = new StringBuilder(input);
        str.reverse();
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        new FinalTester().reverse("hello");
    }
}
