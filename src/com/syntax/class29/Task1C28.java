package com.syntax.class29;

public class Task1C28 {

}
abstract class  Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("getting quote for a Car"+ carModel+ "from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("please cancel my Car insurance"+carModel+ "from "+insuranceName);
    }
}
class Pet extends Insurance{
    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("getting the quote for the Pet"+petType+ "from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for the pet"+petType+ "from "+insuranceName);
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Quote for Health"+ "from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel Health insurance"+ "from "+insuranceName);
    }
}