package Zadanie20_23;

public class Cube extends Shape3D implements FillAble{
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

    @Override
    public void fill(double x) {
        if (x > calculateVolume()) {
            System.out.println("Za dużo wody!");
        } else if (x < calculateVolume()) {
            System.out.println("Za mało wody!");
        } else System.out.println("Figura napełniona");
    }


    @Override
    public int fill2(double volume) {
        double maxVolume = calculateVolume();
        return Double.compare(volume, maxVolume);
    }
}
