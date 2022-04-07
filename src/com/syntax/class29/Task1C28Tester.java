package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1C28Tester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Geico","Ford"));
        insurances.add(new Pet("Allstate","Dog"));
        insurances.add(new Health("BCBS"));

        for(Insurance i:insurances) {
            i.getQuote();
            i.cancelInsurance();

        }
        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
           Insurance i=iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
