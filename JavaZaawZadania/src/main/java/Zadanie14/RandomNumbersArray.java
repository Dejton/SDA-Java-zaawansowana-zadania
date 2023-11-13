package Zadanie14;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class RandomNumbersArray {

    public static List<Integer> getUniqueElements(List<Integer> randomList) {
            return randomList.stream()
                    .filter(element -> Collections.frequency(randomList, element) == 1)
                    .toList();
    }

    public static Set<Integer> getElementWithAtLeastOneRepetition(List<Integer> randomList) {
        return new HashSet<>(randomList.stream()
                .filter(element -> Collections.frequency(randomList, element) > 1)
                .toList());
    }
}
