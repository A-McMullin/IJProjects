package com.syntax.class22;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void overload() {
        System.out.println("This passed nothing");
    }
    private void overload(String a) {
        System.out.println("This passed a string: "+a);
    }
    private void overload(String a, int b){
        System.out.println("This passed a string: "+a+" and a number: "+b);
    }

    public static void main(String[] args) {
        new Task4().overload();
        new Task4().overload("words!");
        new Task4().overload("more words!",12);

    }

}
