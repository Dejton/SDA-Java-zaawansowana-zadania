package Zadanie1;

import java.util.*;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "Z", "B", "D", "C");
        List<String> sortedWithComparator = sortUsingAnonymousClass(unsorted);
        List<String> sortedWithOwnComparator = sortUsingOwnComparator(unsorted);
        List<String> sortedWithLambda = sortUsingLambda(unsorted);
        List<String> sortedWithReverseOrder = sortUsingReverseOrder(unsorted);
        List<String> sortedWithStream = sortUsingStream(unsorted);
        System.out.println(sortedWithComparator);
        System.out.println(sortedWithOwnComparator);
        System.out.println(sortedWithLambda);
        System.out.println(sortedWithReverseOrder);
        System.out.println(sortedWithStream);


    }

    public static List<String> sortUsingAnonymousClass(List<String> unsorted) {

        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                o1.compareTo(o2) -> 0 gdy o1 jest równe o2
                o1.compareTo(o2) -> -1 gdy o1 jest mniejsze o2
                o1.compareTo(o2) -> 1 gdy o1 jest większe o2
                 */
                return o2.compareTo(o1);
            }
        });

        return sorted;
    }

    public static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new OwnSortComparator());
        return sorted;
    }

    public static List<String> sortUsingLambda(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> o2.compareTo(o1));
        return sorted;
    }

    public static List<String> sortUsingReverseOrder(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, Comparator.reverseOrder());
        return sorted;
    }

    public static List<String> sortOnList(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }

    public static List<String> sortUsingStream(List<String> unsorted) {
        List<String> sortedCollections = new ArrayList<>(unsorted);
        return sortedCollections.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
