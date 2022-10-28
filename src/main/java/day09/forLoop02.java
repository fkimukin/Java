package day09;

import java.util.Scanner;

public class forLoop02 {
    public static void main(String[] args) {
        //Example 1: Type code to print characters except "m" in a String.
        // For ex: Andromeda ==> Androeda

//            String str = "Mama";

            //1.way:

//            for (int i = 0; i < str.length(); i++) {
//
//                char ch = str.charAt(i);
//
//                if (ch != 'm') {
//                    System.out.print(ch);
//                }
//
//            }

            //2.way:
//            for (int i = 0; i < str.length(); i++) {
//
//                char ch = str.charAt(i);
//
//                if (ch == 'm') {
//                    continue;
//                }
//                System.out.print(ch);
//            }

//            //If you want to skip any specific value in a loop then use continue keyword.
//
//            //Example 2: Type code to print characters before "m" in a String
//            // For ex: Luxembourg ==> Luxe
//
//            String city = "Luxembourg";
//
//            for (int i = 0; i < city.length(); i++) {
//
//                char ch = city.charAt(i);
//
//                if (ch == 'm') {
//                    break;
//                }
//                System.out.print(ch);
//            }

        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer to see the sum of the unique digit in it");
        String num = input.next();
        int sum = 0;
        for (int i =0; i<num.length(); i++){
            String digit= num.substring(i,i+1);
//            System.out.println(digit);

            if (num.indexOf(digit)== num.lastIndexOf(digit)){
                sum= sum+ Integer.valueOf(digit);
                System.out.print(sum);
            }
        }


        }
    }