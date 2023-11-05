package Zadanie20_21;

public class Cone extends Shape3D{
    double h, a, b, c;

    public Cone(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    double calculateVolume() {
    return  (h * Math.PI * Math.pow(calculatePerimeter(), 2)) / 3;
    }
}
