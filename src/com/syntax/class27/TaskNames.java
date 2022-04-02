package com.syntax.class27;

import java.util.ArrayList;

public class TaskNames {

    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Alpha");
        Names.add("Bravo");
        Names.add("Charlie");
        Names.add("Delta");
        Names.add("Echo");

        System.out.println("Is the array list empty? "+Names.isEmpty());
        System.out.println("Is Echo present in array? "+Names.contains("Echo"));
        System.out.println("The size of the array list is: "+Names.size());

    }
}
