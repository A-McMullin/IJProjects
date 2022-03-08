package com.syntax.class17;

public class HealthyDog {

    String name; //instance variable - in a class but not a method
    String color; //instance variable - in a class but not a method
    static int numberofLegs; //static variable
    void eat() {
        int noOfTimes=3; //local variable - because it is within a method
        //if we know a value will stay the same for all of the objects in a class we would use a static variable
        System.out.println(name+" eats "+noOfTimes+" times and is "+color+" and has "+numberofLegs+" legs");

        }
        void sleep(){
            System.out.println(name+" is sleeping");
        }

    public static void main(String[] args) {
        HealthyDog dog= new HealthyDog(); //local variable because it is within main method
        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberofLegs=4;
        dog.eat();
        dog.sleep();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Tommy";
        dog2.color="Blue";
        HealthyDog.numberofLegs=4;
        dog2.eat();
        dog2.sleep();

    }
}
