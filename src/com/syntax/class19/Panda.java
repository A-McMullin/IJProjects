package com.syntax.class19;

public class Panda {
    String name="KungFu";
    String breed="Red Panda";
    String color="Red";
    int age=12;
    double weight=35;
    double height=2.2;
    Panda () {
    }

    Panda(String pandaName, String pandaBreed, String pandaColor, double pandaHeight, double pandaWeight, int pandaAge) {
    name=pandaName;
    breed=pandaBreed;
    color=pandaColor;
    age=pandaAge;
    weight=pandaWeight;
    height=pandaHeight;
    }

void printInfo(){
    System.out.println(name+" "+breed+" "+color+" "+weight+" "+
            height+" "+age);
}
}
