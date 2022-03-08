package com.syntax.class20;

public class Teacher {

    String name;
    String subject;
    int empNumber;

    void teach(){
        System.out.println("I will teach you Java");
    }

    public static void main(String[] args) {
        Teacher output = new Teacher();
        output.teach();
    }
}
