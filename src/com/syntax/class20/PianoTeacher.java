package com.syntax.class20;

public class PianoTeacher extends Teacher{

    void notes(){
        System.out.println("Music scales");
    }

    public static void main(String[] args) {
    PianoTeacher output2 = new PianoTeacher();
    output2.teach();
    output2.notes();
    }
}
