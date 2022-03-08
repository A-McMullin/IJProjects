package com.syntax.class18;

public class task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
//THESE WILL BE AVAILABLE IN A DIFFERENT PACKAGE

    public static String reverseString(String input){
       /* StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString(); */
        return new StringBuilder(input).reverse().toString(); // method chaining to simplify code
    }

    public static void main(String[] args) {
        String name="Emili";
        System.out.println(task2.reverseString(name));

    }
}
