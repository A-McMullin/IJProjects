package com.syntax.class16;

public class StringBuilderMethod {
    public static void main(String[] args) {
        String s=new String("Asghar is great");
        System.out.println(s.replace(" ", ""));
        s.concat("yayaya");
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Asghar is great");
        stringBuilder.append("blahblahblah"); //append allows for addition to end of called string
        System.out.println(stringBuilder);

        StringBuilder s2 = new StringBuilder(s); //reverses the string
        s2.reverse();
        System.out.println(s2);

    }
}
