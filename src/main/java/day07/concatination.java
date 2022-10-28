package day07;

import java.util.Scanner;

public class concatination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "tom";
        String t = "fath   dyher34534  ...i,";
        int i = 35;
        int a = 5;
        char c = 'K';
        System.out.println(t + " " + c + a + " " + i);

        System.out.println(t.replaceAll("[^A-Z a-z]", ""));
    }
}
