package day03_Scanner;

import java.util.Random;
import java.util.Scanner;

public class ifStatements01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        Double num = input.nextDouble();
        if (num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Non Negative");
        }
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }
    }
}