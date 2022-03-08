package com.syntax.class18;

public class accountTester {
    public static void main(String[] args) {
        Account account = new Account();
       // account.printUsername(); //because it is in a PRIVATE Method
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

    }
}
