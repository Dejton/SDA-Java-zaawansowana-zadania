package Zadanie6;

import java.util.TreeMap;

public class Print {
    public static void printFirstAndLastEntrySet(TreeMap<String, String> input) {
        System.out.println("Pierwszy entrySet: " + input.firstEntry() + " Ostatni entrySet: " + input.lastEntry());
    }
}
