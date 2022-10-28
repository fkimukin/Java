package day21;

import java.util.*;

public class assingment01 {

    public static void lst(List x){
        int i = 1;
        for (Object w : x) {
            System.out.println(i + ". " + w);
            i++;
        }
    }

    public static void main(String[] args) {
        String a;
        String q;
        Scanner input = new Scanner(System.in);
        List nums = new ArrayList<>();


        do {
            do {
                System.out.println("Please enter number to add list.To skip please enter q");

                a = input.nextLine();
                if (!a.equalsIgnoreCase("q")) {
                    nums.add(Integer.parseInt(a));
                }
            } while (!a.equalsIgnoreCase("q"));

            do {
                lst(nums);
                System.out.println("Please choose numbers index to delete. To skip please enter q");
                a = input.nextLine();
                if (!a.equalsIgnoreCase("q")) {
                    nums.remove(Integer.parseInt(a)-1);
                }
            } while (!a.equalsIgnoreCase("q"));
            do {
                lst(nums);
                System.out.println("Please choose numbers index to update. To skip please enter q ");
                a = input.nextLine();
                if (!a.equalsIgnoreCase("q")) {
                    System.out.println("Please enter new number to update. To skip please enter q");
                   String b = input.nextLine();
                    if (!b.equalsIgnoreCase("q")) {
                        nums.set(Integer.parseInt(a) - 1, Integer.parseInt(b));
                    }
                }
            } while (!a.equalsIgnoreCase("q"));
            lst(nums);
            System.out.println("If you want to quit enter 'q' hit enter to continue");
            q = input.nextLine();
        } while (!q.equalsIgnoreCase("q"));

    }
}

