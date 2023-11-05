package Zadanie20_23;

public abstract class Shape3D extends Shape implements FillAble{

    @Override
    public void fill(int x) {
        if (x > calculateVolume()) {
            System.out.println("Za dużo wody!");
        } else if (x < calculateVolume()) {
            System.out.println("Za mało wody!");
        } else System.out.println("Figura napełniona");
    }

    abstract double calculateVolume();
}
