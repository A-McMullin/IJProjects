package com.syntax.class19;

public class task1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String job="Sweeper";
    double salary=32000;
    String boss="Steve";
    int empNumber=34;

    task1(){

    }
    public task1(String job, double salary, String boss, int empNumber) {
        this.job = job;
        this.salary = salary;
        this.boss = boss;
        this.empNumber = empNumber;
    }

    void PrintInfo(){
        System.out.println("Job: "+job);
        System.out.println("Salary: "+salary);
        System.out.println("Boss: "+boss);
        System.out.println("Employee Number: "+empNumber);
    }
}
