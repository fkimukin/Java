package day06;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number");
        double i = input.nextDouble();
        double result = i>=0 ? i*2 : -2*i;
        System.out.println(result);
    }
}
