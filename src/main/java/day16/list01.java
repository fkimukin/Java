package day16;

import java.util.ArrayList;
import java.util.List;

public class list01 {
    public static void main(String[] args) {

        List<Integer> a= new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> c= new ArrayList<>();
        for (int b: a) {
            if (!c.contains(b)) {
                c.add(b);
            }

        }
        System.out.println(c);






    }
}
