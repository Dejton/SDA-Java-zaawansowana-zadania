package Zadanie16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(513, Integer.MAX_VALUE),
    INTERMEDIATE(257, 512),
    ADVANCED(150, 256);

    private final int minMinutes;
    private final int maxMinutes;
    private static final Runner[] VALUES = values();

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    public static Runner getFitnessLevel(int runningTimeInMinutes) {
        return Arrays.stream(VALUES)
                .filter(runner -> runningTimeInMinutes <= runner.maxMinutes && runningTimeInMinutes >= runner.minMinutes)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza zakresu: " + runningTimeInMinutes));
    }


}
