package day08;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        char x = input.next().toLowerCase().charAt(0);
        switch (x) {
            case 'a' -> System.out.println("Vowel");
            case 'e' -> System.out.println("Vowel");
            case 'i' -> System.out.println("Vowel");
            case 'u' -> System.out.println("Vowel");
            case 'o' -> System.out.println("Vowel");
            default -> System.out.println("Not vowel");
        }
    }
}
