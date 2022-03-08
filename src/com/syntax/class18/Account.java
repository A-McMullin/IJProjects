package com.syntax.class18;

public class Account {

    private String userName= "Teyfur";
    private String password = "admin";
    protected String accountNumber="123456";
    private double balance=1500;

    private void printUsername() {
        System.out.println(userName);

    }
    protected void printPassword() {
        System.out.println(password);
    }
    void printBalance() {
        System.out.println(balance);
    }
    public void printAccountNumber() {
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.printUsername();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

        System.out.println(account.accountNumber);
        System.out.println(account.password);
        System.out.println(account.userName);
        System.out.println(account.balance);

    }
}
