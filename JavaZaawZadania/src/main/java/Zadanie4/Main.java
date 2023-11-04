package Zadanie4;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("2", "value2_1");
        storage.addToStorage("2", "value2_2");
        storage.addToStorage("3", "value3_1");
        storage.addToStorage("4", "value0_1");

        System.out.println();

        storage.printValues("2");
        storage.printValues("4");

        System.out.println(storage.findKeysByForEach("value0_1"));
        System.out.println(storage.findKeysByForEach("value1_1"));
        System.out.println(storage.findKeysByForEach("value4_1"));

    }
}
