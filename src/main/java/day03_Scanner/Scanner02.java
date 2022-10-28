package day03_Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the width");
        Double width = input.nextDouble();
        System.out.println("enter length");
        Double length = input.nextDouble();
        System.out.println("The area is "+width * length +" good to go");



    }
}
