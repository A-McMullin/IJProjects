package com.syntax.HW;

public class FrogTester {
    public static void main(String[] args) {

        Frog frog = new Frog("Jethro", "green", 2, 7);

        frog.printInfo();
        new Frog("Froggy", "blue",2).printInfo();

        //need to have a constructor with the 3 arguments or it would
        //create error. Because there are 4 instance variable and this
        //only gives answers to three arguments, it would refer to the
        //default of the missing variable.


    }
}
