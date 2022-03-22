package GroupHW;

interface Shape {
    void calcArea(int a);
    void calcPerimeter(int r);
}

class Circle implements Shape {

    public void calcArea(int r) {
        double area;
        area = Math.PI * r * r;
        System.out.println("Area of Circle is: " + area);
    }
    public void calcPerimeter(int r) {
        double perimeter;
        perimeter = Math.PI * 2 * r;
        System.out.println("Perimeter of Circle is: " + perimeter);
    }
}
class Square implements Shape {
    public void calcArea(int a) {
        int area = a * a;
        System.out.println("Area of Square is: " + area);
    }
    public void calcPerimeter(int a) {

        int perimeter = 4 * a;
        System.out.println("Perimeter of Square is: " + perimeter);
    }
}

public class ShapeCalc {
    public static void main(String[] args) {
        Circle circleCalc = new Circle();
        Square squareCalc = new Square();

        circleCalc.calcArea(6);
        circleCalc.calcPerimeter(12);

        squareCalc.calcArea(10);
        squareCalc.calcPerimeter(14);
    }
}

