package day09;

import java.util.Scanner;

public class manuplate03 {
    public static void main(String[] args) {
        String str = "Ali is 13 years old. I like Ali. Ali does not like me!...";
        int numOfAllChars = str.length();
        int numOfAllCharsDiffFromPunctuationMarks= str.replaceAll("\\p{Punct}","").length();
        System.out.println(numOfAllChars-numOfAllCharsDiffFromPunctuationMarks);

        Scanner input= new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName= input.nextLine();
        String fixedFullName = fullName.trim(); // delete just space first and last block
        System.out.println(fixedFullName);

    }
}
