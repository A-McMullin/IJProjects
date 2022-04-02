package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ListDemo4 {
    public static void main(String[] args) {

        HashSet<String> fruit = new HashSet<>(); //randomize list but excludes duplicates
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("kiwi");
        fruit.add("apple");

        System.out.println(fruit);

        LinkedHashSet<String> fruit1 = new LinkedHashSet<>(); //returns list in order but does not include duplicates
        fruit1.add("apple");
        fruit1.add("banana");
        fruit1.add("mango");
        fruit1.add("orange");
        fruit1.add("kiwi");
        fruit1.add("apple");
    }
}
