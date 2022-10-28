package day05;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        double firstNum = input.nextDouble();
        System.out.println("enter the second number");
        double secondNum = input.nextDouble();
        System.out.println("Enter the operation among +, -, *, /");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.println(firstNum + secondNum);
            case '-' -> System.out.println(firstNum - secondNum);
            case '*' -> System.out.println(firstNum * secondNum);
            case '/' -> System.out.println(firstNum / secondNum);
        }
    }
}
