package com.syntax.class21;

public class Shape {

    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }
}
class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
        void testArea() {
            System.out.println("The area of the circle is: "+(radius*radius)*3.14);
    }
}
class Area {
    public static void main(String[] args) {
        Circle rad = new Circle(12);
        rad.testArea();
    }
}