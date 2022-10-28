package day05;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter passwors");
        char pwdInitial = input.next().charAt(0);

        if (pwdInitial >= 'A' && pwdInitial <= 'Z') {
            if (pwdInitial == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else if (pwdInitial>= 'a' && pwdInitial<= 'z') {
            if (pwdInitial=='z') {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        }
    }
}
