package Zadanie3;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void shouldReturnListWithComasAndDotInLastElement() {
//        given
        Map<String, Integer> map = Stream.of(
                Map.entry("Java", 18),
                Map.entry("Python", 1),
                Map.entry("PHP", 0)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        String expected = "Klucz: Java, Wartość: 18,\nKlucz: Python, Wartość: 1,\nKlucz: PHP, Wartość: 0.";
//        when
        String result = Main.getStringFromMap(map);
//        then
        assertThat(result).isEqualTo(expected);
    }

    void shouldReturnExceptionIfContainNull() {
        //        given
        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("Java", 18);
        map1.put(null, 1);
        map1.put("PHP", 0);

        String expected = "Klucz: Java, Wartość: 18,\nKlucz: Python, Wartość: 1,\nKlucz: PHP, Wartość: 0.";
//        when
        String result = Main.getStringFromMap(map1);
//        then
        assertThat(result).isEqualTo(expected);
    }

}