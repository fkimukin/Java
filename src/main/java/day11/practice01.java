package day11;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        int counter = 0;


        do {
            if (counter ==3){
                System.out.println("Your account is blocked");
                break;}

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = input.nextLine();
        System.out.println("Enter your password");
        String pass = input.nextLine();

        if (userName.equals("admin") && pass.equals("pwd123")) {
            System.out.println("You are connected.");
            counter= 0;
            break;
        } else { counter++;
            System.out.println("your username or password is wrong");
                }
            }while (true);

        }
    }
