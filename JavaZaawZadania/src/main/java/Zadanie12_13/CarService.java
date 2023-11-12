package Zadanie12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAll() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .toList();
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .toList();
    }

    public Car getMostCheapCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .get();
    }
    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .get();
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .toList();
    }

    public List<Car> getCarsWithMin2Producers() {
        return cars.stream()
                .filter(cars -> cars.getManufacturers().size() >= 2)
                .toList();
    }
    public List<Car> sortCars(String par) {

        if (par.equalsIgnoreCase("rosnąco")) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        } else if (par.equalsIgnoreCase("malejąco")) {
           return cars.stream()
                   .sorted((a, b) -> b.getName().compareTo(a.getName()))
                   .collect(Collectors.toList());
        } else {
            System.out.println("Błędna wartość!");
        }
        return null;
    }
    public boolean isTheCarOnTheList(String name) {
      for (Car e : cars) {
          if (e.getName().equalsIgnoreCase(name)) return true;
      }
      return false;
    }



}
