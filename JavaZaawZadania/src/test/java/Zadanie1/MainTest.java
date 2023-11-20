package Zadanie1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void thatListIsSorted() {
//    given
        List<String> listOfStrings = List.of("Kamila", "Kordian", "Patryk", "Agnieszka", "Zbyszek");
        List<String> expected = List.of("Zbyszek", "Patryk", "Kordian", "Kamila", "Agnieszka");
//    when
        List<String> result = Main.sortUsingOwnComparator(listOfStrings);
//    then
        assertThat(result).isEqualTo(expected);
    }

}