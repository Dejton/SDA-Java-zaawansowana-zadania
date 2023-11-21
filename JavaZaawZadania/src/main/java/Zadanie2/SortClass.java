package Zadanie2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortClass {
    public static List<String> sort(List<String> input) {
        if (input.isEmpty() || (input.contains(null) || input.contains("") || input.contains(" "))) {
            throw new IllegalArgumentException("Wprowadzono błędną wartość!");
        } else {
            return input.stream()
                    .sorted((o1, o2) -> o2.compareToIgnoreCase(o1))
                    .toList();
        }
    }
}
