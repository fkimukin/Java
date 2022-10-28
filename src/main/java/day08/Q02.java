package day08;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your body weight");
        double mass = input.nextDouble();
        System.out.println("enter your body height");
        double height = input.nextDouble();
        double massinx = (mass / (height * height));
        System.out.println("your IBM is " + massinx);
        if (massinx < 0){
            System.out.println("incorrect input");
        }else if (massinx < 18.5){
            System.out.println("you are weak");
        }else if (massinx <= 25) {
            System.out.println("you are in ideal weight");
        } else if (massinx < 30 ) {
            System.out.println(" you are fat");
        } else if (massinx >= 30 ) {
            System.out.println("you are obese");
        }   else {
            System.out.println("incorrect input");
        }
    }
}
