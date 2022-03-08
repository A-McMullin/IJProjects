package com.syntax.class17;
//reversing string word for word

public class Task4 {
    public static void main(String[] args) {


        String s = "Sunday is great";
        Task4 Task4 = new Task4();
        //System.out.println(Task4.reverseString(s));
        String[] strArray = s.split(" ");
        //System.out.println(strArray[2]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(Task4.reverseString(strArray[i]) + " ");
        }
    }
    String reverseString(String inputString) {
        StringBuilder stringBuilder= new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}


