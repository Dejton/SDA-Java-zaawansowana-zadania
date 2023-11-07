package Zadanie26;

import java.util.Objects;

public class Car {
    private final String name, description;
    private final CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(description, car.description) && carType == car.carType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, carType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", carType=" + carType +
                '}';
    }
}
