package com.syntax.class23;

public class Car {

    void start() {
        System.out.println("Use key to start car");
    }
    void stop() {
        System.out.println("Use brakes to stop vehicle");
    }
    void park() {
        System.out.println("Park the car");
    }
}
class BMW extends Car {
    void start() {
        System.out.println("Use button to start car");
    }
    void stop() {
        System.out.println("Car can brake automatically");
    }
    void park() {
        System.out.println("Car can park itself");
    }
}
