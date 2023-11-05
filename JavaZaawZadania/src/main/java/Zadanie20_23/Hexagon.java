package Zadanie20_23;

public class Hexagon extends Shape{
    private final double a;

    public Hexagon(double a) {
        this.a = a;
    }



    @Override
    public double calculatePerimeter() {
        return 6 * a;
    }
}
