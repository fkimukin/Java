package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice02 {

        public static void main(String[] args) {


            String arr[]= {"John", "Brad", "Angel", "Sofia", "Emily"};
            String brr[]= {"sofia", "Brad", "grace", "emily", "hazel"};
            List list = new ArrayList<>();

            for (String w: arr) {
                if (Arrays.toString(brr).toLowerCase().contains(w.toLowerCase())) {
                    list.add(w);
                }
            }
            System.out.println(list);
        }
    }


