package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {

        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Selenium");
        System.out.println(courses);
       // for (int i = 0; i<courses.size(); i++) {
        //    if(courses.get(i).equals("Java")) {
         //       courses.set(i,"Happy");
         //       System.out.println(courses);
                Iterator<String> iterator = courses.iterator();
                System.out.println(iterator.hasNext()); // returns boolean value
                System.out.println(iterator.next()); // prints value of index
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }



    }
}
