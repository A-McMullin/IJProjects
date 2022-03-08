package com.syntax.class19;

public class Cow {
    /* The constructor that is provided automatically when we don't
    create any constructors in a class is called the Default constructor
     */
    static int normalNumberOfLegs=4;
    /* When we don't values to the instance fields
    Java assigns default value to these fields
     */
    private String name; //default is Null
    int age; //default is 0
    double weight; // default is 0.0
    String breed;
    char gender='\u263A';
    /* Below is Zero Argument or No Argument Constructor
     */
    Cow() {
    /* You might want to execute some code to set up the
    resources for your class like opening the connection to
    database, checking if internet is available, or not etc
     */
    }
void printName(){

    System.out.println(weight);
}
}
