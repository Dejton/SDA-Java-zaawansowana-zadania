package Zadanie27;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... elements) {
        if (this.delimiter.matches(".{2,}")) throw new IllegalArgumentException("Błędna wartość");
        return Arrays.stream(elements)
                .map(Objects::toString)
                .collect(Collectors.joining(delimiter));
    }
}
