package day30;

import java.util.Scanner;

public class ChangingLettersToAsterics {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter name surname credit number");

            String str = input.nextLine();
            String name = str.split(" ")[0];
            String surname = str.split(" ")[1];
            String cardNum = str.split(" ")[2];

            String hiddenName = name.replaceAll("[a-z]", "*");
            String hiddenSurName = surname.replaceAll("[a-z]", "*");
            String hiddenNum = "";

            for (int i = 0; i < cardNum.length(); i++) {
                if (i < cardNum.length() - 4) {

                    hiddenNum = hiddenNum + "*";
                } else {
                    hiddenNum = hiddenNum + cardNum.charAt(i);
                }
            }
            System.out.println(hiddenName + " " + hiddenSurName + " " + hiddenNum);
        } catch (Exception e){
            System.out.println("some kind of problem occured");
        }


    }
}



