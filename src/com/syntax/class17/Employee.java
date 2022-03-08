package com.syntax.class17;

import java.security.SecureRandom;

public class Employee {

    String empID;
    double salary;
    static String CEO="Sumair";


    public static void main(String[] args) {
        Employee Asghar=new Employee();
        Asghar.empID="123";
        Asghar.salary=90000;
        System.out.println(Asghar.empID);
        System.out.println(Asghar.salary);
        System.out.println(Employee.CEO);

        System.out.println("------------------------");

        Employee Asel=new Employee();
        Asel.empID="654";
        Asel.salary=95000;
        System.out.println(Asel.empID);
        System.out.println(Asel.salary);
        System.out.println(Employee.CEO);
    }




}
