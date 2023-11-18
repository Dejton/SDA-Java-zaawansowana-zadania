package ZadaniaDodatkowe.Zadanie1;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class SortStrings {
    public List<String> search(List<String> values) {
       return values.stream()
                .filter(value -> value.matches("\\bc[a-zA-Z]{2}\\b"))
                .toList();
    }

    public String getString(List<Integer> values) {
        return String.join(", ", values.stream()
                .map(value -> (value % 2 == 0) ? "e" + value.toString() : "o" + value.toString())
                .toList());

//        List<String> finalList = new ArrayList<>();
//
//        for (Integer e : values) {
//            if (e % 2 == 0) {
//                finalList.add("e" + e.toString());
//            } else finalList.add("o" + e.toString());
//        }
//        return finalList.toString();
    }
}
