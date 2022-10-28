package day07;

import java.util.Scanner;

public class modulusOperator01 {
    public static void main(String[] args) {
//      if (10%5 == 0) {
//          System.out.println("Even");
//      } else {
//          System.out.println("odd");
//      }
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
int absNumber = Math.abs(number);
System.out.println(absNumber%2==0);

    }
}
