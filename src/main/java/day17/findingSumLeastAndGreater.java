package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findingSumLeastAndGreater {
    public static void main(String[] args) {

        List<String> myList= Arrays.asList("$12.99","$8.25","$23.56","$456.12");

        List<Double> myDoublelist= new ArrayList<>();

        for (String w : myList){
            double price=Double.valueOf(w.replace("$",""));
            myDoublelist.add(price);
        }
        System.out.println(myDoublelist);
        System.out.println(myDoublelist.get(0)+myDoublelist.get(myDoublelist.size()-1));


    }
}
