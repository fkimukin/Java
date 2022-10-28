package Day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();

        myList.add(20);
        myList.add(40);
        myList.add(60);
        myList.add(100);
        ListIterator<Integer> myItr= myList.listIterator();

        while (myItr.hasNext()){
            myItr.next();

        }
        while (myItr.hasPrevious()) {
            Integer el = myItr.previous();
            myItr.set(el * 1200 / 100);

        }
        Collections.reverse(myList);
        System.out.println(myList);



    }
}