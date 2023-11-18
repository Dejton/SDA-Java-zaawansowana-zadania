package Zadanie28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
       List<E> finalList =  new ArrayList<>();
        int currentIndex = startIndex;
        while(currentIndex < this.size()) {
            finalList.add(this.get(currentIndex));
            currentIndex+= skip + 1;
        }
        return finalList;
    }
}
