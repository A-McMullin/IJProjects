package com.syntax.class19;

public class task1tester {
    public static void main(String[] args) {
        task1 company = new task1();
        company.PrintInfo();
        System.out.println("-----------------");
        task1 company1 = new task1("supervisor", 45000,
                "Lenny", 20);
        company1.PrintInfo();
    }
}