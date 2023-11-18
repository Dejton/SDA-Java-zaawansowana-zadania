package Zadanie28;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SkipArrayList<String> list = new SkipArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);

        list.addAll(List.of("a", "b", "c", "d","e", "f", "g","h", "i", "j", "k","l", "m", "n", "o"));

        System.out.println(list.getEveryNthElement(2,3));
    }
}
