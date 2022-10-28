package day10;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Start number");
//        int min= input.nextInt();
//        System.out.println("Enter End number");
//        int max=input.nextInt();
//        while (min <= max ) {
//            if (min%2==1) {
//                System.out.print(min + " ");
//            }
//            min++;
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Start number");
//        int min= input.nextInt();
//        System.out.println("Enter End number");
//        int max=input.nextInt();
//        int sum = 0;
//        while (min <= max ) {
//           sum = sum +min;
//            min++;
//            }
//        System.out.println(sum);


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter number");
//        int num=input.nextInt();
//        int sum = 0;
//        while (0 < num ) {
//            sum = sum +num%10;
//           num = num/10;
//        }
//        System.out.println(sum);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num=input.nextInt();
        int i =1;

        while (i <=10 ) {
                        System.out.println(num+"x"+i+"="+(num*i)+"   " );
            i++;
        }



    }
}
