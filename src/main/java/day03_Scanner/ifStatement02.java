package day03_Scanner;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write day");
        String dayName = input.next();
        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
                    }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")) {
            System.out.println("Weekend");
        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend");
        }
        //anoter metod
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");
        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");
        if(isWeekDay){
            System.out.println("Weekday");
        }else if(isWeekEndDay){
            System.out.println("Weekend day");
        }else{
            System.out.println("Invalid day name");
        }
    }
    }

