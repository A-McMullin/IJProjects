package GroupHW;

class Car {
    int carPrice;
    String color;
    Car (int carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }
    double calcSalePrice(){
        return carPrice;
    }
    void display(){
        System.out.println();
    }
}
class Sedan extends Car{
    int length;
    Sedan(int carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }
    double calcSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
    void display(){
        System.out.println("The sedan is a Kia, "+"the color is, " + color+" and the price is $" + calcSalePrice());
    }
}
class Truck extends Car {
    int weight;
    Truck(int carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    double calcSalePrice() {
        if (weight > 2000) {
            return (carPrice * 0.9);
        } else {
            return (carPrice * 0.8);
        }
    }
    void display(){
        System.out.println("The truck is a Chevrolet, "+"the color is " + color+", and the price is $" + calcSalePrice());
    }
}

public class CarPrice {
    public static void main (String[] args){

        Car Kia = new Sedan(22500, "Green", 17);
        Kia.display();

        Car Chevrolet = new Truck(35000, "Black", 4200);
        Chevrolet.display();
    }
}

