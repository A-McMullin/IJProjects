package com.syntax.class18;

public class AccessModifierTester {

    public static void main(String[] args) {
        AccessModifier am=new AccessModifier();
        System.out.println(am.weight);
       // System.out.println(am.name); - Can't pull data because it is a Private modifier
        System.out.println(am.color);
        System.out.println(am.age);

    }
}
