package day03_Scanner;

import java.util.Scanner;

public class scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter width");
        double width = input.nextDouble();
        System.out.println("enter length");
        double length = input.nextDouble();
        System.out.println("enter heigth");
        double heigth = input.nextDouble();
        System.out.println("the volume is "+width*length*heigth +" Total surface"+(2*heigth*length + 2*heigth*width + 2*width*length) +"oleeey good work" );
    }
}
