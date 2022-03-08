package com.syntax.class20;

public class B extends A {
    int numOfLegs;

    void printInfo(){
        System.out.println("Animal type: "+animal);
        System.out.println("Number of legs: "+numOfLegs);
     }
    public static void main(String[] args) {
        B output1 = new B();
        output1.printF();
    }
}
