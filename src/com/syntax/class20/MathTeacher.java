package com.syntax.class20;

public class MathTeacher extends Teacher{
    void add() {
        System.out.println("How to add");
    }
    void sub(){
        System.out.println("How to subtract");
    }

    public static void main(String[] args) {
    MathTeacher output1 = new MathTeacher();
    output1.sub();
    output1.teach();
    }
}
