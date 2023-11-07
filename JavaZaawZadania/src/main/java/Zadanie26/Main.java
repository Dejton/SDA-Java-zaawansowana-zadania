package Zadanie26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Car a3 = new Car("A3", "German car manufacturer", CarType.SEDAN);
        Car a4 = new Car("A4", "German car manufacturer", CarType.SEDAN);
        Car a6 = new Car("A6", "German car manufacturer", CarType.CABRIO);
        Car camry = new Car("Camry", "Japanese car manufacturer", CarType.COUPE);
        Car corolla = new Car("Corolla", "Japanese car manufacturer", CarType.SEDAN);
        Car mustang = new Car("Mustang", "American car manufacturer", CarType.SEDAN);
        Car f150 = new Car("F-150", "American car manufacturer", CarType.CABRIO);
        Car civic = new Car("Civic", "Japanese car manufacturer", CarType.COUPE);
        Car accord = new Car("Accord", "Japanese car manufacturer", CarType.CABRIO);

        Model audi = new Model("Audi", 2020, new ArrayList<>());
        Model toyota = new Model("Toyota", 1982, new ArrayList<>());
        Model ford = new Model("Ford", 2030, new ArrayList<>());
        Model honda = new Model("Honda", 1979, new ArrayList<>());

        Manufacturer audiAG = new Manufacturer("Audi AG", 1909,new ArrayList<>());
        Manufacturer toyotaMotorCorporation = new Manufacturer("Toyota Motor Corporation", 1937,new ArrayList<>());
        Manufacturer fordMotorCompany = new Manufacturer("Ford Motor Company", 1904,new ArrayList<>());
        Manufacturer  hondaMotorCo = new Manufacturer("Honda Motor Co.", 1948,new ArrayList<>());

        audi.getCars().add(a3);
        audi.getCars().add(a4);
        audi.getCars().add(a6);
        toyota.getCars().add(camry);
        toyota.getCars().add(corolla);
        ford.getCars().add(mustang);
        ford.getCars().add(f150);
        honda.getCars().add(civic);
        honda.getCars().add(accord);

        audiAG.getModels().add(audi);
        toyotaMotorCorporation.getModels().add(toyota);
        fordMotorCompany.getModels().add(ford);
        hondaMotorCo.getModels().add(honda);

        carService.allCars.add(a3);
        carService.allCars.add(a4);
        carService.allCars.add(a6);
        carService.allCars.add(camry);
        carService.allCars.add(corolla);
        carService.allCars.add(mustang);
        carService.allCars.add(f150);
        carService.allCars.add(civic);
        carService.allCars.add(accord);


        carService.allModels.add(audi);
        carService.allModels.add(toyota);
        carService.allModels.add(ford);
        carService.allModels.add(honda);

        carService.allManufacturers.add(audiAG);
        carService.allManufacturers.add(toyotaMotorCorporation);
        carService.allManufacturers.add(fordMotorCompany);
        carService.allManufacturers.add(hondaMotorCo);

        List<Model> models = carService.getAllModels();
        System.out.println("Models: " + models.size());
        List<Car> cars = carService.getAllCars();
        System.out.println("Cars: " + cars.size());

        List<String> manufacturersNames = carService.manufacturersNames();
        System.out.println("Manufacturers names: " + manufacturersNames.size());

        List<Integer> years = carService.manufacturersYearsOfCreation();
        System.out.println("Years of Creations: " + years);

        List<String> modelsNames = carService.modelsNames();
        System.out.println("All models names: " + modelsNames);

        List<Integer> startingYearsProduction = carService.startYears();
        System.out.println("Years: " + startingYearsProduction);

        List<String> carsNames = carService.allCarsNames();
        System.out.println("All cars names: " + carsNames);

        List<String> carsDescriptions = carService.allCarsDescriptions();
        System.out.println("All cars descriptions: " + carsDescriptions.size());

        List<Model> evenYears = carService.evenStartingYearsOfProduction();
        System.out.println("Even years of production: " + evenYears.size());

        List<Car> carsFromEvenManufacturers = carService.carsFromManufacturersWithEvenYearOfCreation();
        System.out.println("Cars from Manufacturers with even year of production: " + carsFromEvenManufacturers.size());

        List<Car> carsFromOddManuAndEvenProductionYear = carService.carsFromOddManuAndEvenProductionYear();
        System.out.println("Cars from manufacturers with odd creation year and even production year: " + carsFromOddManuAndEvenProductionYear.size());

        List<Car> cabrioCars = carService.cabrioCarsWithOddModelYearAndEvenManuYear();
        System.out.println("Cabrio cars: " + cabrioCars);

        List<Car> sedanCars = carService.sedanCars();
        System.out.println("Sedan cars: " + sedanCars);
    }
}
