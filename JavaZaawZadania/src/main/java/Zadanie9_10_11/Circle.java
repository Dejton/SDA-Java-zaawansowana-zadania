package Zadanie9_10_11;

public class Circle {
    private final Point2D center, point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt((Math.pow(point.getX() - center.getX(), 2))
                + (Math.pow(point.getY() - center.getY(), 2)));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}