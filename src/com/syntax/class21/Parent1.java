package com.syntax.class21;

public class Parent1 {
    String name = "Parent";
    void printName() {
        System.out.println(name);
    }

}
class Child1 extends Parent1 {
    String name= "Child"; //instance variable because it is within a class but outside a method
    void printName() {
        String name="shamalamadingdong"; //local variable given priority over instance variable
        System.out.println(name); //pulls value from local variable
        System.out.println(this.name); //pulls value from subclass variable
        //THIS keyword will allow the instance variable to display
        System.out.println(super.name); //SUPER keyword pulls value from super class variable
    }
}
class ParentTester1{
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.printName();
    }
}