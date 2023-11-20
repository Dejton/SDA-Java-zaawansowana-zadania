package Zadanie2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortClassTest {
    @Test
    void thatListIsSorted() {
//        given
        List<String> listOfStrings = List.of("Kamila", "Kordian", "agnieszka", "Patryk", "zbyszek");
        List<String> expected = List.of("zbyszek", "Patryk", "Kordian", "Kamila", "agnieszka");
//        when
        List<String> result = SortClass.sort(listOfStrings);
//        then
        assertThat(expected).isEqualTo(result);
    }

}