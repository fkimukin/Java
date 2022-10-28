package day31_lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaFP01 {
     /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
    It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name and they can be implemented
     right in the body of a method.
     functional programming is called lambda . To type codes in functional programming is shorter and it is error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.
     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functioanl programming can be used for arrays, collections and maps
     but we cannot use maps directly in functional programmine directly. At the beginnig we should convert a map to a
     collection and then we can use maps for functional programming as weel ==>How to convert a map into a collection??

      by using entryset() we can convert a map into a set and set is collection then you can use Collections in functional programming.
     */


    public static void main(String[] args) {

        List<Integer> l= new ArrayList<>();


        l.add(8);
        l.add(9);
        l.add(6);
        l.add(1);
        l.add(3);
        l.add(1);
        l.add(1);

//printElementsFunction(l);
//printSquareOfOddElements(l);
//printCubeOfOddElements(l);
//productOfCubesOfDistinctEvenElement(l);
getMaxElement02(l);



    }


    public static void printElements(List<Integer> list) {
        for(Integer w: list){
            System.out.print(w +" & ");
        }
    }
    public static void printElementsFunction(List<Integer> list) {
        list.stream().forEach(t-> System.out.println(t + " ") );
        }


    public static void printEvenElementsFunc(List<Integer> list) {
        list.stream().filter(t-> t%2==0).forEach(t -> System.out.println(t+" "));
    }

    // distinct()  use for not repeat same variable
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().distinct().filter(t-> t%2!=0).map(t -> t*t ).forEach(t -> System.out.print(t+" "));
    }
    public static void printCubeOfOddElements(List<Integer> list) {
        list.stream().distinct().filter(t-> t%2!=0).map(t -> t*t*t ).forEach(t -> System.out.println(t+" "));
    }
//reduce reduse to output elements. identity 0 is u=0. if we use multiplication or division use 1
    public static void sumOfSquaresOfDistinctEvenElement(List<Integer> list) {
        Integer sum= list.stream().distinct().filter(t-> t%2==0).map(t -> t*t ).reduce(0,(t,u)-> t+u);
    }
    public static void productOfCubesOfDistinctEvenElement(List<Integer> list) {
        Integer product=list.stream().distinct().filter(t-> t%2==0).map(t -> t*t*t ).reduce(1,(t,u)-> t*u);
        System.out.println(product);
    }

    public static void getMaxElement(List<Integer> list) {
     Integer result=list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(result);
    }
    public static void getMaxElement02(List<Integer> list) {
        Integer result=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)-> u);//sorted method always puts the ele.s in ascending
        System.out.println(result);
    }

    }




