package day26;

import java.util.Scanner;

    public class SumOfDigit {


        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter string");
            String str= input.next();
            System.out.println(sumOfDIgits(str));
        }
        public static  int sumOfDIgits(String str){
            int sum = 0;
            char[] arr=str.toCharArray();
            for (char a: arr){

                try {
                    sum = sum + Integer.valueOf(String.valueOf(a));
                }catch (NumberFormatException e){}
            }

            return sum;
        }
    }



