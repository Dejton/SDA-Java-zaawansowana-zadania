package Zadanie6;

import java.util.TreeMap;

public class Print {
    public static String getFirstAndLastEntrySet(TreeMap<String, String> input) {
        if (input == null) return null;
        return "Pierwszy entrySet: " + input.firstEntry() + " Ostatni entrySet: " + input.lastEntry();
    }
}
