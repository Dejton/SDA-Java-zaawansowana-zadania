package Zadanie12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer volvo = new Manufacturer("Volvo", 1930, "Sweden");
        Manufacturer benz = new Manufacturer("Benz", 1883, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901, "Germany");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer porshe = new Manufacturer("Porshe", 1931, "Germany");

        // #Cars
        Car xc90 = new Car("XC90", "XC90", 400_000, 2023, List.of(volvo), EngineType.V8);
        Car xc60 = new Car("XC60", "XC60", 200_000, 2022, List.of(volvo), EngineType.V6);
        Car x500 = new Car("x500", "x500", 100_000, 2020, List.of(fiat), EngineType.S4);
        Car gls1 = new Car("GLS_1", "GLS", 500_000, 2021, List.of(mercedes, benz), EngineType.V12);
        Car gls2 = new Car("GLS_2", "GLS", 700_000, 2023, List.of(mercedes, benz), EngineType.V12);
        Car cayenne = new Car("Cayenne", "Cayenne", 450_000, 2022, List.of(porshe), EngineType.S6);
        Car multipla = new Car("Multipla", "Multipla", 1, 1995, List.of(fiat), EngineType.S3);

        carService.add(xc90);
        carService.add(xc60);
        carService.add(x500);
        carService.add(gls1);
        carService.add(gls2);
        carService.add(cayenne);
        carService.add(multipla);

//        List<Car> cars = carService.getAll();
//        System.out.println("All cars: " + cars.size());
//
//        carService.removeCar(x500);
//        List<Car> carsWithoutX500 = carService.getAll();
//        System.out.println("carsWithoutX500: " + carsWithoutX500.size());
//        List<Car> carsWithV12Engine = carService.getCarsWithV12Engine();
//        System.out.println("Cars with v12 engine: " + carsWithV12Engine.size());

//        List<Car> carsProducedBefore1999 = carService.getCarsProducedBefore1999();
//        System.out.println("Cars produced before 1999: " + carsProducedBefore1999.size());

//        Car mostCheapCar = carService.getMostCheapCar();
//        System.out.println("Cheappest car: " + mostCheapCar);

//        List<Car> carsProducedBy = carService.getCarsProducedBy(benz);
//        System.out.println("Cars produced by Benz: " + carsProducedBy.size());

//        System.out.println(carService.getMostExpensiveCar());

//        System.out.println(carService.getCarsWithMin2Producers().size());

//        System.out.println(carService.sortCars("rosnąCo"));
//        System.out.println(carService.sortCars("malejąco"));
//        System.out.println(carService.sortCars("maleaco"));

        System.out.println(carService.isTheCarOnTheList("xc90"));
        System.out.println(carService.isTheCarOnTheList("xc9dsa"));
        System.out.println(carService.isTheCarOnTheList("multipla"));


    }
}
