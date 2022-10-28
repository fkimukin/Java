package day23.day27;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        //Example 2: If the number of characters is more than 4, remove them from the link list

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("MaryJane");
        names.add("Carl");
        names.add("AliKaptan");

      for (int i=0 ; i<names.size(); i++){

          if(names.get(i).length()>4){
              names.remove(names.get(i));
              i--;//sildiğin için index eksiliyor unutma
          }

      }
        System.out.println(names);

    }
}
