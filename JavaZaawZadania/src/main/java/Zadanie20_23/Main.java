package Zadanie20_23;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);

        Shape triangle = new Triangle(2,3,4);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        double hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagon Perimeter: " + hexagonPerimeter);

        Shape3D cone = new Cone(2,3,4,5);
        double coneVolume = cone.calculateVolume();
        System.out.println("cone Volume: " + coneVolume);

        Shape3D cube = new Cube(7);
        double cubeVolume = cube.calculateVolume();
        System.out.println("cube Volume: " + cubeVolume);
    }
}
