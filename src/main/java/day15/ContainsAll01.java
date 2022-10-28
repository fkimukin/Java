package day15;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll01 {
    public static void main(String[] args) {
        List<Integer> m= new ArrayList<>();
        m.add(12);
        m.add(23);
        m.add(32);
        m.add(14);
        m.add(24);
        m.add(56);

        List<Integer> n= new ArrayList<>();
        n.add(23);
        n.add(56);
        n.add(24);

boolean areExist = m.containsAll(n);
        System.out.println(areExist);


    }
}
