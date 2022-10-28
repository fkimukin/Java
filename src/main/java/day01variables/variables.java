package day01variables;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //for multiple input
        System.out.println("enter your full name please");
        String userName= input.nextLine();
        System.out.println(userName);
System.out.println("enter your age");
int age= input.nextInt();
        System.out.println(age);
    }
}
