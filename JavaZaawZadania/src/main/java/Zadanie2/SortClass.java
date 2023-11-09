package Zadanie2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortClass {
    public static List<String> sort(List<String> input) {
        return input.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}
