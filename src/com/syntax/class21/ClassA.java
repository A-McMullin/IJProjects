package com.syntax.class21;

public class ClassA {
    void method(){
        System.out.println("Method from Class A");
    }
}

class ClassB extends ClassA {
    void method() {
        System.out.println("Method from Class B");

    }
    void test() {
    method();
    this.method();
    super.method();
    }
}
class Tester {
    public static void main(String[] args) {
        ClassB classb = new ClassB();
        classb.test();
    }
}