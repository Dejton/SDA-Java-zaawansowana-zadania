package Zadanie14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomNumberArray = new ArrayList<>();
        for (int i = 1; i <= 100000 ; i++) {
            randomNumberArray.add((int)(Math.random() * (100 - 1 + 1) + 1));
        }


        System.out.println(RandomNumbersArray.getUniqueElements(randomNumberArray));
        System.out.println(RandomNumbersArray.getElementWithAtLeastOneRepetition(randomNumberArray));


    }
}
