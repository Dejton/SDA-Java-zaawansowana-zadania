package Zadanie26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
     List<Car> allCars = new ArrayList<>();
     List<Model> allModels = new ArrayList<>();
     List<Manufacturer> allManufacturers = new ArrayList<>();

    public CarService() {
    }


    public List<Model> getAllModels() {
        return allModels
                .stream()
                .toList();
    }

    public List<Car> getAllCars() {
        return allCars
                .stream()
                .toList();
    }

    public List<String> manufacturersNames() {
        return allManufacturers
                .stream()
                .map(Manufacturer::getName)
                .toList();
    }

    public List<Integer> manufacturersYearsOfCreation() {
        return allManufacturers
                .stream()
                .map(Manufacturer::getYearOfCreation)
                .toList();
    }

    public List<String> modelsNames() {
        return allModels
                .stream()
                .map(Model::getName)
                .toList();
    }

    public List<Integer> startYears() {
        return allModels
                .stream()
                .map(Model::getProductionYear)
                .toList();
    }

    public List<String> allCarsNames() {
        return allCars
                .stream()
                .map(Car::getName)
                .toList();
    }

    public List<String> allCarsDescriptions() {
        return allCars
                .stream()
                .map(Car::getDescription)
                .toList();
    }

    public List<Model> evenStartingYearsOfProduction() {
        return allModels
                .stream()
                .filter(year -> year.getProductionYear() % 2 == 0)
                .toList();
    }

    public List<Car> carsFromManufacturersWithEvenYearOfCreation() {
        return allManufacturers
                .stream()
                .filter(year -> year.getYearOfCreation() % 2 == 0)
                .flatMap(models -> models.getModels().stream())
                .flatMap(cars -> cars.getCars().stream())
                .toList();
    }

    public List<Car> carsFromOddManuAndEvenProductionYear() {
        return allManufacturers
                .stream()
                .filter(year -> year.getYearOfCreation() % 2 != 0)
                .flatMap(models -> models.getModels().stream())
                .filter(oddModels -> oddModels.getProductionYear() % 2 == 0)
                .flatMap(cars -> cars.getCars().stream())
                .toList();
    }

    public List<Car> cabrioCarsWithOddModelYearAndEvenManuYear() {
        return allManufacturers
                .stream()
                .filter(year -> year.getYearOfCreation() % 2 == 0)
                .flatMap(model -> model.getModels().stream())
                .filter(model -> model.getProductionYear() % 2 != 0)
                .flatMap(car -> car.getCars().stream())
                .filter(carType -> carType.getCarType() == CarType.CABRIO)
                .toList();
    }

    public List<Car> sedanCars() {
        return allManufacturers
                .stream()
                .filter(year -> year.getYearOfCreation() < 1919)
                .flatMap(model -> model.getModels().stream())
                .filter(modelYear -> modelYear.getProductionYear() > 2019)
                .flatMap(cars -> cars.getCars().stream())
                .filter(carType -> carType.getCarType() == CarType.SEDAN)
                .toList();
    }
}
