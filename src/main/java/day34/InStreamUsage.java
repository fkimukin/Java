package day34;

import day32_lamda.UtilsClass;

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
        System.out.println(getSumFromSevenToHundred01(l));
        System.out.println(getSumFromSevenToHundred02(l));
        System.out.println(getMultiplicationFromTwoToEleven(l));
        System.out.println(calculateFactorial01(4));
        System.out.println(calculateFactorial02(4));
        System.out.println(sumOfIntsInGivenRange(2,5));
        System.out.println(sumOfDigitForTheIntsInTheGivenRange(2,5));



    }


    public static int getSumFromSevenToHundred01(List<Integer> list) {
        return IntStream.range(7,101).reduce(0, Math::addExact);
    }
    public static int getSumFromSevenToHundred02(List<Integer> list) {
        return IntStream.rangeClosed(7,100).reduce(0, Math::addExact);
    }
    public static int getMultiplicationFromTwoToEleven(List<Integer> list) {
        return IntStream.rangeClosed(2,11).reduce(1, Math::multiplyExact);
    }
    public static int calculateFactorial01(int a) {
        if (a>0) {
            return IntStream.rangeClosed(1, a).reduce(1, Math::multiplyExact);
        }else {
            System.out.println("do not use negaive number for factorial operation");}
                return 0;
    }
    public static Object calculateFactorial02(int a) {

            return a>0 ? IntStream.rangeClosed(1, a).reduce(1, Math::multiplyExact) : "do not use negaive number for factorial operation";
    }
    public static int sumOfIntsInGivenRange(int a, int b) {
        int x=0;
if (a>b){
    x=a;
    a=b;
    b=x;
}
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).reduce(1, Math::addExact);
    }
    public static Object sumOfDigitForTheIntsInTheGivenRange(int a,int b) {
        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigit).sum();
    }


}
