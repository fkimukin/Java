package day04practice;

import java.util.Scanner;

public class q01ifsatatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Score");
        String inputScore = input.next();                // input can be number and also any letters. google it (in java string to int)
        if (!inputScore.matches("[0-9]+")) {       // checking input is number . if input is number <else> code run
            System.out.println("Not a number! Enter only number");
        }
        else {
        int score = Integer.parseInt(inputScore) ;        // string textscore convert to int score then math logic can be work. otherwise java give error

        if (score >= 50 && score <= 100) {
            System.out.println("oleey you pass!");
        }
        else if (score < 50 && score >= 0) {
            System.out.println("ooops, you fail. may be next time");
        }
    else {
            System.out.println("Invalid score. try again");
        }
        }
    }
}