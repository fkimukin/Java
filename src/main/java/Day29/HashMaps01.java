package Day29;

import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges= new HashMap<>();

        stdAges.put("fatih",35);
        stdAges.put("Tom Hank",53);
        stdAges.put("Brat Pitt",53);
        stdAges.put("Angelina Jolie",43);
        System.out.println(stdAges);


        Set<String> keys=stdAges.keySet();
        System.out.println(keys);
        Collection<Integer> values =stdAges.values();
        System.out.println(values);



        Set<Map.Entry<String,Integer>> entries=stdAges.entrySet();
        System.out.println(entries);



for (Map.Entry<String, Integer> w:entries){

    System.out.println(w+"!");
}

    }

}
