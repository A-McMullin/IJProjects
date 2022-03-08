package com.syntax.class19;

public class Car {
    String name;
    String make;
    String color;
    String type;
    /*
    If we have same local and instance variables Java will
    prefer the local variable values. If you want to instruct
    Java to use the instance variables, use the 'this' keyword
    */
    public Car(String name, String make, String color, String type) {
        this.name = name; //instance variable
        this.make = make;
        this.color = color;
        this.type = type;
    }

    public Car() {

    }

    void printCar() {
        String name="Tesla"; //local variable
        System.out.println(name);
        System.out.println(this.name); //pulls the value of the instance variable
    }
}
