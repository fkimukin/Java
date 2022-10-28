package day10;

import java.util.Scanner;

public class nestedLoops01 {
    public static void main(String[] args) {
//        int weeknum= 4;
//        for ( int i = 1 ; i <= weeknum ; i++){
//            System.out.println("Week: "+i);
//            for ( int k =1 ; k<8 ; k++ ){
//                System.out.println("   Day: "+k);
//            }
//        }


        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int rows = input.nextInt();
        for (int i = 1 ; i <= rows ; i++) {
            for ( int k = 1; k <=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
