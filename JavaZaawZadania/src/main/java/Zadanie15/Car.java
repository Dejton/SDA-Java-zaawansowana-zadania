package Zadanie15;

import java.util.Comparator;

public enum Car {
    FERRARI(1000000.0, 200, false, 350),
    PORSCHE(500000.0, 150, false, 300),
    MERCEDES(400000.0, 100, true, 250),
    BMW(350000.0, 150, true, 200),
    OPEL(200000.0, 100, false, 200),
    TOYOTA(300000.0, 50, true, 150);

    private final double price;
    private final int power;
    private boolean isRegular;
    private final int speed;

    Car(double price, int power, boolean isRegular, int speed) {
        this.price = price;
        this.power = power;
        this.isRegular = isRegular;
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isPremium() {
        if (isRegular) return false;
        return true;
    }
    public boolean isRegular() {
        return isRegular;
    }
    public boolean isFasterThan(Car car) {
        if (Integer.compare(this.getSpeed(), car.getSpeed()) == - 1 || Integer.compare(this.getSpeed(), car.getSpeed()) == 0) return false;
        return true;
    }
}
