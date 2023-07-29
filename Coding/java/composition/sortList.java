package composition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortList {
    public static void main(String[] args) {
        List<String> unsortedList=new ArrayList<>();
        unsortedList.add("Audi");
        unsortedList.add("Cadilac");
        unsortedList.add("Mercedes");
        unsortedList.add("Bentley");
        unsortedList.add("Pagani");

        Collections.sort(unsortedList);

        System.out.println("Sorted list: "+unsortedList);
    }
}
