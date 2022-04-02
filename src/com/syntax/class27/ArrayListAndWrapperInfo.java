package com.syntax.class27;

/*
Collections framework in Java:
    collection of classes that help us manage and manipulate data in a better way

    1. ArrayList
        A. This class has many built-in methods like add() remove() clear() etc.
        B. Dynamic and can adjust their size at run time

        ArrayList<data type> arrayList=new ArrayList<>();
        ArrayList--> name of the class

    2. Wrapper classes
    byte - Byte
    short - Short
    int - Integer

    We get built-in methods with Wrappers
    A lot of frameworks don't support primitives

    When to use primitive:
        1. When we care about the memory because primitives occupy 4 times less memory
        2. Performance
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndWrapperInfo {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1=new Double(10.5); //This is not a preferred way
        double number = double1.doubleValue(); //This is called UNboxing - Not preferred way
        Double number2 = new Double(number); //This is called boxing
        double number3 = 10.5; //This is called AUTOboxing
        Double number4=number3; //This is AUTOunboxing

        System.out.println(number3);
        System.out.println(number4);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("cherries");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("lettuce");
        vegetables.add("onion");
        vegetables.add("radish");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);

        System.out.println(groceries.containsAll(vegetables));

        List<String> lister = Arrays.asList("fruit "+"apple "+"cherry "+"onion "+"radish ");
        System.out.println(lister);

    }

}
