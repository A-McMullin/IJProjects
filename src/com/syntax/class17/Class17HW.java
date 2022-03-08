package com.syntax.class17;

public class Class17HW {

    String Name;
    int ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Class17HW student = new Class17HW();
        student.Name = "Gocha";
        student.ID = 1489060;
        student.numberOfStudents++;

        Class17HW student2 = new Class17HW();
        student2.Name = "Gregoria";
        student2.ID = 1205780;
        student2.numberOfStudents++;

        Class17HW student3 = new Class17HW();
        student3.Name = "Sejfo";
        student3.ID = 1128250;
        student3.numberOfStudents++;

        System.out.println("Total number of students: "+numberOfStudents);
    }

}
