package day32_lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaFP02 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();


        l.add(8);
        l.add(9);
        l.add(6);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);

//        UtilsClass.printElements(l);
//        UtilsClass.printSquareOfOddElements(l);
        System.out.println(sumOfSquaresOfDistinctEvenElement(l));



    }
    public static Integer sumOfSquaresOfDistinctEvenElement(List<Integer> list) {
        Integer sum= list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).reduce(0,(t,u)-> t+u);
        return sum;
    }



    }
