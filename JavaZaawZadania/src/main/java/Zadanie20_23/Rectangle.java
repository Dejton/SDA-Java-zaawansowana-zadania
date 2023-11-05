package Zadanie20_23;

public class Rectangle extends Shape{
    private final double a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculatePerimeter() {
        return (2 * a) + (2 * b);
    }
}
