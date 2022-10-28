package day26;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        divide(6, 0);

    }

    public static void divide(int a, int b) {
        try {
            System.out.println(a / b + "was saved to database");
        } catch (ArithmeticException e) {
            System.out.println("do not use zero as divider");
        } finally {
            System.out.println("cut the connection to database");
        }

    }
}


