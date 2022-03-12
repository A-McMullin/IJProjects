package com.syntax.class22;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
     */
    public static void main(String[] args) {
        area(10,5);
        area(6);
        area(12,46,4);
    }
    static void area (int length, int width) {
        System.out.println("The area of a rectange is: "+(length*width));
    }
    static void area (int width) {
        System.out.println("The area of a square is: "+(width*width));
    }
    static void area (int length, int width, int height) {
        System.out.println("The area of a box is: "+(width*height*length));
    }
}
