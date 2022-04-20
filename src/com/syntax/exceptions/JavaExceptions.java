package com.syntax.exceptions;

public class JavaExceptions {

    public static void main(String[] args) {

        System.out.println("0");

        try {
          //  System.out.println(10/0);
          //  String name = null;
          //  name.length();
          //  int[] arr = new int[-5];
            String [] strArr = new String[2];
            strArr[5]= "issues";

        } catch (ArithmeticException arithmeticException) {
            System.out.println("1");
        } catch (NullPointerException nullPointerException) {
            System.out.println("2");
        } catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println("3");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("4");
        }
    }
}
