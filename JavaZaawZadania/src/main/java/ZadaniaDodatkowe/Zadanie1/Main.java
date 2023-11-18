package ZadaniaDodatkowe.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOFStrings = new ArrayList<>();
        List<Integer> listOfIntegers = new ArrayList<>();
        SortStrings searchList = new SortStrings();

        listOFStrings.add("Karol");
        listOFStrings.add("Adam");
        listOFStrings.add("Cbd");
        listOFStrings.add("cka");
        listOFStrings.add("Ckda");
        listOFStrings.add("ckrt");
        listOFStrings.add("cma");
        listOFStrings.add("Cma");
        listOFStrings.add("krystian");
        listOFStrings.add("scf");
        listOFStrings.add("ccc");

        listOfIntegers.add(2);
        listOfIntegers.add(20);
        listOfIntegers.add(5);
        listOfIntegers.add(13);
        listOfIntegers.add(44);
        listOfIntegers.add(15);
        listOfIntegers.add(223);
        listOfIntegers.add(6);
        listOfIntegers.add(20);
        listOfIntegers.add(5);
        listOfIntegers.add(666);

        System.out.println(searchList.search(listOFStrings));
        System.out.println(searchList.getString(listOfIntegers));

    }
}
