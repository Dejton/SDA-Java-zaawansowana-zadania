package Zadanie9_10_11;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(0,4);

        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

//        circle.move(new MoveDirection(3,-3));
//
//        System.out.println(center.getX() + " " + center.getY());
//        System.out.println(point.getX() + " " + point.getY());

        circle.resize(2.5);

        System.out.println(center.getX() + " " + center.getY());
        System.out.println(point.getX() + " " + point.getY());

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
