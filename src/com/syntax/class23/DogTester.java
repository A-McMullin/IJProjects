package com.syntax.class23;

public class DogTester {

    public static void main(String[] args) {

        Dog dog = new Dog(); //pulls from the Dog objects were they are
                            //empty and return default values
        System.out.println(dog);
        Dog dog2 = new Dog("Tommy",
                "Green", "RedBull", 12, 25.5);
        dog2.changeInfo("Rocky", "Black", "BullDog");
        System.out.println(dog2);
    }
}
