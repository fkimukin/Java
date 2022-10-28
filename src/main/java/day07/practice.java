package day07;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
                int num = input.nextInt();
        int last = num%10;
        System.out.println(last);
    }
}
