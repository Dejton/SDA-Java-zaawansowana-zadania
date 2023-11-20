package Zadanie32;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static Zadanie30.Main.DIR_PATH;
import static Zadanie30.Main.INPUT_FILE_NAME;


public class Task {
    private static final String DIR_PATH = "src/main/java/Zadanie32";
    private static final String INPUT_FILE_NAME = "Task.txt";

    public static void main(String[] args) {
        Path dirPath = Path.of(DIR_PATH);
        Path inputFile = dirPath.resolve(INPUT_FILE_NAME);

        List<Car> cars = List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 150_000, false)
        );

//        boolean result = save(inputFile.toFile(), cars);
//        System.out.println(result);
        List<Car> load = load(inputFile.toFile());
        System.out.println(load);
    }

    private static boolean save(File inputFile, List<Car> content) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile))){
           oos.writeObject(content);
           return true;
        } catch (IOException e) {
            System.out.println("Log: " + e);
            return false;
        }
    }

    private static List<Car> load(File file) {
        try ( ObjectInputStream ios = new ObjectInputStream(new FileInputStream(file))){
            Object o = ios.readObject();
            return (List<Car>) ios.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
