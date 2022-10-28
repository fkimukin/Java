package Day29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    public static void main(String[] args) {

        List<String > list1=new ArrayList<>();

        list1.add("Ali");
        list1.add("Ayshia");
        list1.add("Can");
        System.out.println(list1);

for (String w: list1){

   list1.set(list1.indexOf(w),w+"!" );
       }

        Iterator<String> itr1=list1.iterator();
while (itr1.hasNext()){
    String el= itr1.next();
    itr1.remove();

}
        System.out.println(list1);


        List<String > list2=new ArrayList<>();

        list2.add("Ali");
        list2.add("Ayshia");
        list2.add("Can");
ListIterator<String> itr2=list2.listIterator();

while (itr2.hasNext()){
    String el2= itr2.next();
   itr2.set(el2+"*");

}
        System.out.println(list2);










}



    }




