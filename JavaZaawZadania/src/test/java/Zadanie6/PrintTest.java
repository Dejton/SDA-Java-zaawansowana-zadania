package Zadanie6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    private TreeMap startMap;

    @BeforeEach
     void init() {
        startMap = new TreeMap<>();
    }
    @Test
    void shouldReturnFirstAndLastEntrySet() {
//        given
//        TreeMap<String, String> map = new TreeMap<>();
        startMap.put("Patryk", "Firlus");
        startMap.put("Krzysztof", "Kaszpirowski");
        startMap.put("Jan", "Kowalski");
        startMap.put("Adam", "Nowak");
        startMap.put("Zbigniew", "Skoczek");

        String expected = "Pierwszy entrySet: Adam=Nowak Ostatni entrySet: Zbigniew=Skoczek";
//        when
        String result = Print.getFirstAndLastEntrySet(startMap);
//        then
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void shouldReturnNullIfNull() {
//        given

//        when
        String result = null;
//        then
        assertNull(result);
    }
    @Test
    void shouldReturnEmptyIfIsEmpty() {
//        given
        String expected = "Pierwszy entrySet: null Ostatni entrySet: null";
//        when
        String result = Print.getFirstAndLastEntrySet(startMap);
//        then
        assertThat(result).isEqualTo(expected);
    }

}