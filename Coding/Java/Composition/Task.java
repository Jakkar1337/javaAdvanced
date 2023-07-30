package Composition;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<String,Integer > stringMap=new HashMap<>();

        stringMap.put("Java", 18);
        stringMap.put("Python", 1);
        stringMap.put("PHP", 0);

        printMap(stringMap);
    }

    public static void printMap(Map<String, Integer>map) {
        int i=0;
        int size =map.size();

        for (Map.Entry<String, Integer>entry : map.entrySet()){
            System.out.print("Klucz: "+entry.getKey()+", Wartosc: "+entry.getValue());

            if (i<size-1){
                System.out.println(",");
            }

            i++;
        }
        System.out.println(".");
    }
}
