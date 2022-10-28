package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrListPractice02 {
    public static void main(String[] args) {

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        if (m.equals(n)){
            System.out.println("the list are same");
        }else {
            System.out.println("the list are not same");
        }

    }
}
