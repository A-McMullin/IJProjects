package com.syntax.class18;

public class Facebook {

    private String userName;
    private String password;
    private int age;

    void setAge(int personage) {
        if (personage>5 && personage<80){
            age=personage;
        } else {
            System.out.println("Not allowed");
        }
    }
    int getAge(String password) {
        if (password.equals(password)) {
            return age;

        } else {
            return -1;
        }

    }
}
