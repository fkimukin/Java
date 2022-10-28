package Day29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    public static void main(String[] args) {

        String sentence= "I like to move it, move it, do you lake to move it?";
        sentence=sentence.replaceAll("\\p{Punct}","");
        String [] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> occurenceMap= new HashMap<>();
        for (String w:words) {
            Integer numOfOccurences=occurenceMap.get(w);
            if (numOfOccurences==null){
                occurenceMap.put(w,1);
            }else {
                occurenceMap.put(w,numOfOccurences+1);}
        }
        System.out.println(occurenceMap);

    }


}
