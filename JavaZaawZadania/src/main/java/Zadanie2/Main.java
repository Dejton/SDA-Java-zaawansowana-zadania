package Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("agnieszka");
        strings.add("Zbyszek");
        strings.add("Patryk");
        strings.add("Krystian");
        strings.add("Krzysztof");
        strings.add("Błażej");
        strings.add("Oskar");
        System.out.println(SortClass.sort(strings));
    }
}
