package com.syntax.class22;

public class MethodOverloadDemo1 {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40,50);
    }
    static void sum(int num, int num2) {
        System.out.println(num+num2);
    }
    static void sum(int num, int num2, int num3){
        System.out.println(num+num2+num3);
    }
    static void sum(int ...numArray){
        int sum=0;
            for(int num:numArray) {
                sum=sum+num;
            }
        System.out.println(sum);
    }
}
