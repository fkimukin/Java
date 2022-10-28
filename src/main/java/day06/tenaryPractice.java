package day06;

import java.util.Objects;
import java.util.Scanner;

public class tenaryPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        double a = input.nextDouble();
        System.out.println("Enter b number");
        double b = input.nextDouble();

        Object result = a >= 0 && b >= 0 ? a * b : "i cant multiply";
        System.out.println(result);

    }
}
