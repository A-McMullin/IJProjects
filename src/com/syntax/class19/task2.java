package com.syntax.class19;

public class task2 {

    String name;
    double subject1;
    double subject2;
    double subject3;

    public task2(String name, double subject1, double subject2, double subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    void printAvgGrade(){
        System.out.println("Name: "+name+" "+(subject1+subject2+subject3)/3);
    }
}
