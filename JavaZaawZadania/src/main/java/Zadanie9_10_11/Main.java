package Zadanie9_10_11;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(0,4);

        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
