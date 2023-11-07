package Zadanie26;

import java.util.List;
import java.util.Objects;

public class Model {
    private final String name;
    private final int productionYear;
    List<Car> cars;

    public Model(String name, int productionYear, List<Car> cars) {
        this.name = name;
        this.productionYear = productionYear;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return productionYear == model.productionYear && Objects.equals(name, model.name) && Objects.equals(cars, model.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productionYear, cars);
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", cars=" + cars +
                '}';
    }
}
