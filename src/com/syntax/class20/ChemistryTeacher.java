package com.syntax.class20;

public class ChemistryTeacher extends Teacher{

    void compounds(){
        System.out.println("Chemistry");
    }

    public static void main(String[] args) {
    ChemistryTeacher output3 = new ChemistryTeacher();
    output3.teach();
    output3.compounds();
    }
}
