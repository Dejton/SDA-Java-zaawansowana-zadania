package Zadanie3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> map = new LinkedHashMap<>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);
//        printUsingString(map);

    }

    public static void printMap(Map<String, Integer> mapToPrint) {
        int i = 0;

        for (Map.Entry<String, Integer> e : mapToPrint.entrySet()) {
            i++;
            if (i == mapToPrint.size()) {
                System.out.println("Klucz: " + e.getKey() + ", Wartość: " + e.getValue() + ".");
            } else System.out.println("Klucz: " + e.getKey() + ", Wartość: " + e.getValue() + ",");
        }


    }

    public static String getStringFromMap(Map<String, Integer> input) {

        if (input.containsKey(null) || input.containsKey("") || input.containsKey(" ") || input.isEmpty()) {
            throw new IllegalArgumentException("Podano błędną wartość!");
        } else if (input.containsValue(null)) {
            {
                throw new IllegalArgumentException("Podano błędną wartość!");
            }
        } else {
            return input.entrySet()
                    .stream()
                    .map(e -> "Klucz: " + e.getKey() + ", Wartość: " + e.getValue())
                    .collect(Collectors.joining(",\n", "", "."));
        }
    }
}
