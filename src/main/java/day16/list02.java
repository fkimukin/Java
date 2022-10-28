package day16;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class list02 {
    public static void main(String[] args) {


//        List<String> letter = new ArrayList<>();
//        letter.add("A");
//        letter.add("K");
//        letter.add("R");
//        letter.add("S");

//        Scanner input= new Scanner(System.in);
//        System.out.println("Type letter");
//        String key= input.next();
//        if (letter.contains(key)){
//            letter.set(letter.indexOf(key),"got it");
//        }else {
//            letter.add(key);
//        }
//        System.out.println(letter);



//        List<Integer> a= new ArrayList<>();
//        a.add(12);
//        a.add(15);
//        a.add(10);
//        a.add(21);
//        a.add(50);
//        Collections.sort(a);
//
//        int minDiff= Integer.MAX_VALUE;
//
//        for (int i = 1; i<a.size(); i++ ){
//         minDiff= Math.min(minDiff, a.get(i) - a.get(i-1));
//
//        }
//        System.out.println(minDiff);
//
//        for (Integer x: a) {
//            if (x !=7) {
//                a.set(a.indexOf(x), x + 3);
//            }
//        }

        List<String> d= new ArrayList<>();
        d.add("11");
        d.add("31");
        d.add("22");
        d.add("17");
        d.add("31");
        d.add("21");
        d.add("67");

        for (int i = d.size()-5; i>=0 ; i--){
            d.set(i,"*");


        }
        System.out.println(d);

    }
}