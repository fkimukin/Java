package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrListPractice01 {
    public static void main(String[] args) {
        List<Integer> s= new ArrayList<>();

        s.add(5000);
        s.add(6000);
        s.add(4500);
        s.add(3900);
        s.add(7200);
        int counter= 0;
        for (Integer a : s){
            s.set(counter, (int) (a * 1.10));
            counter++;
        }
        System.out.println(s);

    }
}
