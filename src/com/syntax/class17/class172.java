package com.syntax.class17;
//palindrome with boolean result

public class class172 {
    public static void main(String[] args) {
        class172 task=new class172();
        System.out.println(task.ispalindrome("aba"));
        System.out.println(task.ispalindrome("abbc"));
    }

    boolean ispalindrome(String inputStr) {
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }
        String reverseString(String inputString) {
            StringBuilder stringBuilder= new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }

    }

