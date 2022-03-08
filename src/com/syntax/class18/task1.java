package com.syntax.class18;

import java.util.Scanner;

public class task1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visible only within same package and accessible by the creating an instance of the class.
     */

    int sumArray(int [] array) {
        int sum=0;
        for (int num:array) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) { //this will only work within the same package or class
        int [] array={10,10,10};
        task1 task=new task1();
        System.out.println(task.sumArray(array));
    }
}
