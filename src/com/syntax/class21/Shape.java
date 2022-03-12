package com.syntax.class21;

public class Shape {

    double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
}
class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }
        void testArea() {

        System.out.println("The area of the circle is: "+(radius*radius)*Math.PI);
    }
}
class Area {
    public static void main(String[] args) {
        Circle rad = new Circle(12);
        rad.testArea();
    }
}