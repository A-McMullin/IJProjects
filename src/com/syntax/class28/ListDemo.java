package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("name");
        arrayList.add("AWS");
        arrayList.add("APM");
        arrayList.add("Docker");
        arrayList.add("Dead");

        System.out.println(arrayList);
        arrayList.set(arrayList.indexOf("Dead"), "Make Money"); //replace
        arrayList.set(4,"Make Money"); //Puts new value in specified index spot - that's why there's two now
        System.out.println(arrayList);

    }
}
