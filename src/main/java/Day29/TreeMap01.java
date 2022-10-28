package Day29;

import java.util.*;

public class TreeMap01 {

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulation=new TreeMap<>();
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("TR", 80000000);
        countryPopulation.put("DU", 12000000);
        countryPopulation.put("DN", 3000000);

        System.out.println(countryPopulation);
        Map.Entry<String, Integer> dataCeilling= countryPopulation.ceilingEntry("T");
        System.out.println(dataCeilling);


       NavigableSet<String> keyInDescending= countryPopulation.descendingKeySet();
        System.out.println(keyInDescending);

        Map.Entry<String, Integer> abc= countryPopulation.lowerEntry("DU");
        System.out.println(abc);

       SortedMap<String, Integer> subMap1= countryPopulation.subMap("DN",false,"USA",true);
        System.out.println(subMap1);

SortedMap<String, Integer> subMap2=countryPopulation.subMap("DU","USA");
        System.out.println(subMap2);


       SortedMap<String , Integer>tailTreeMap=countryPopulation.tailMap("DU");
        System.out.println(tailTreeMap);


    }
}