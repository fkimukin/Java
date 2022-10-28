package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practiceTernary {
    public static void main(String[] args) {

//        {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter number");
//            int num = input.nextInt();
//
//            System.out.println(num % 2 == 0 ? "Even" : num + 3);
//        }

        String arr[]= {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr[]= {"sofia", "Brad", "grace", "emily", "hazel"};
        List comp = new ArrayList<>();

        for (String w: arr) {
            for (String a : brr) {
                if (a.equalsIgnoreCase(w)) {
                    comp.add(a);
                }
            }
        }

        System.out.println(comp);

    }
}



