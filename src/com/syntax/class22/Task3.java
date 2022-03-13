package com.syntax.class22;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static void main(String[] args) {
    phone(8, "Samsung","Note 10");
    phone("Samsung",8,"Note 10");
    phone("Note 10", "Samsung", 8);
    }
    private static void phone (String brand, int ram, String model) {
        System.out.println("Brand: "+brand+" Ram: "+ram+" Model: "+model);
    }
    private static void phone (int ram, String model, String brand) {
        System.out.println("Ram: "+ram+" Model: "+model+" Brand: "+brand);
    }
    private static void phone (String model, String brand, int ram) {
        System.out.println("Model: "+model+" Brand: "+brand+" Ram: "+ram);
    }
}
