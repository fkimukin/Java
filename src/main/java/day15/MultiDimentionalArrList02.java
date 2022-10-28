package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiDimentionalArrList02 {
    public static void main(String[] args) {

        ArrayList<Integer> mylist1= new ArrayList<Integer>();

        ArrayList<Integer> myList2= new ArrayList<>();

        List<Integer> myList3 = new ArrayList<>();

        System.out.println(myList3);

        myList3.add(12);
        myList3.add(7);
        myList3.add(23);
        System.out.println(myList3);
myList2.add(111);

        myList3.add(1,50);
        System.out.println(myList3);
        myList3.addAll(2,myList2);
        System.out.println(myList3);
        System.out.println(myList3.size());
//        int sizeOf=myList3.size();
//        if (sizeOf!=0){
//            System.out.println("the list not empty");
//        }else {
//            System.out.println("list is empty");
//        }
//        boolean isEmpty = myList3.isEmpty();
//        if(isEmpty){
//            System.out.println("the list empty");
//        }else {
//            System.out.println("the list not empty");
//        }

//        List<String> d= new ArrayList<>();
//
//        d.isEmpty();
//d.removeAll(myList2);


        List<String> e = new ArrayList<>();
        e.add("Shoes");
        e.add("TV");
        e.add("Radio");
        e.add("Laptop");
        e.add("Shoes");
        e.add("Book");
        e.add("Shoes");

//        myList3.removeAll(e);
//        System.out.println(myList3);
// 1. way
//        e.removeAll(Collections.singleton("Shoes"));

// 2. way
//        List<String> c=new ArrayList<>();
//        c.add("Shoes");
//
//        e.removeAll(c);
//        System.out.println(e);

e.remove(3);


    }
}
