package day14;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {


//        double[] str= new double[5];
//        str [0]= 1.4;
//        str [1]= 2.4;
//        str [2]= 5.4;
//        str [3]= 7.4;
//        str [4]= 2.4;
//        double sum= 0;
//
//        for (double w : str){
//            sum = sum + w;
//
//        }
//        System.out.println(sum);


//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(Arrays.toString(cars));
//        Arrays.sort(cars);
//        System.out.println(Arrays.toString(cars));
//        for (String w : cars){
//            if (w.length() < 4){
//                System.out.println(w);
//            }
//        }


        String[] student = {"Mark", "Murty", "Jack", "Tom","Tackerbell"};
        for (String w : student){

            if (w=="Tom"){
               continue;
            }
            System.out.println(w);
        }


        


    }
}
