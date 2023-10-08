package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfInts = new ArrayList<>();
        listOfInts.add(3);
        listOfInts.add(5);

        for (Integer i : listOfInts) {
            System.out.println(i);
        }

        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("Joan");
        setOfStrings.add("Joan");

        for (String s : setOfStrings){
            System.out.println(s);
        }

        Map<String, List<String>> hashStringMap = new HashMap<>();
        hashStringMap.put("Banka e pare",List.of("Joan"));
        hashStringMap.put("Banka e dyte", List.of("Sonila"));
        hashStringMap.put("Banka e trete", List.of("Marsela","Narilda"));

        for (Map.Entry<String,List<String>> entry : hashStringMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        hashStringMap.remove("Banka e pare");

        System.out.println("====================");

        for (Map.Entry<String,List<String>> entry : hashStringMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
