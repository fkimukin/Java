package day33lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class InStreamUsage {

    public static void main(String[] args) {

        List<Integer> l= new ArrayList<>();


        l.add(8);
        l.add(9);
        l.add(6);
        l.add(1);
        l.add(3);
        l.add(9);
        l.add(10);
        l.add(102);
        System.out.println(getSumFromSevenToHundred(l));






    }


    public static int getSumFromSevenToHundred(List<Integer> list) {
        return IntStream.range(7,101).reduce(0, Math::addExact);
    }
    public static int getSumFromSevenToHundred02(List<Integer> list) {
        return IntStream.rangeClosed(7,100).reduce(0, Math::addExact);
    }
    
    

}
