package GroupHW;

abstract class Marks {
    int a;
    int b;
    int c;
    int d;

    Marks (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    double getPercentageA(){
        return (a + b + c) / 3;
    }
    double getPercentageB(){
        return (a + b + c + d) / 4;
    }
}
class A extends Marks {
    A(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    @Override
    double getPercentageA() {
        return super.getPercentageA();
    }
}
class B extends Marks {
    B(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    @Override
    double getPercentageB() {
        return super.getPercentageB();
    }
}
public class AvgMarks {
    public static void main (String[] args){

        Marks studentA = new A(78, 54, 67, 90);
        Marks studentB = new B(45,85,59,92);

        System.out.println("The average for Student A: " + studentA.getPercentageA());
        System.out.println("The average for Student B: " + studentB.getPercentageB());

    }
}

