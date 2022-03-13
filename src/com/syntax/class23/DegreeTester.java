package com.syntax.class23;

class Degree {

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}
class Master extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("To get a Masters you need Bachelors");
    }
}
public class DegreeTester {

    public static void main(String[] args) {

        Master master = new Master();
        master.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
    }
}