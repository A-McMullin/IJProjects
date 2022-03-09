package com.syntax.class21;

public class MethodOverloadDemo2 {

    static void printInfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }
    static void printInfo(int age, String name, double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }
    static void printInfo(double weight,String name, int age ){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverloadDemo2 methodoverloaddemo2 = new MethodOverloadDemo2();
        methodoverloaddemo2.printInfo("Jackrabbit", 23, 5.0);

    }
}
