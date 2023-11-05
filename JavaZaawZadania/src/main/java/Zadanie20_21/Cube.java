package Zadanie20_21;

public class Cube extends Shape3D{
    private final double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    double calculateVolume() {
        return Math.pow(a,3);
    }
}
