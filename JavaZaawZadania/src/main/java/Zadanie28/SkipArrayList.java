package Zadanie28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
       List<E> finalList =  new ArrayList<>();
        int counter = startIndex;
        while(counter < this.size()) {
            finalList.add(this.get(counter));
            counter+= skip + 1;
        }
        return finalList;
    }
}
