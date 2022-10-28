package day32_lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaFP01 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();


        l.add(8);
        l.add(9);
        l.add(6);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);

        getMinGreatherThanSevenEvenNum(l);
getHalfOfDistinctElReversOrder(l);
    }


    public static void getMinGreatherThanSevenEvenNum(List<Integer> list) {

        Integer min=list.stream().distinct().filter(t-> t>7).filter(t-> t%2==0).sorted().findFirst().get();

        System.out.println(min);
    }
    public static void getHalfOfDistinctElReversOrder(List<Integer> list) {

        List<Double> result=list.stream().distinct().filter(t-> t>5).map(t-> t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(result);
    }
    public static void printElementList(List<Integer> list) {

        list.stream().forEach(System.out::println);

    }






}



