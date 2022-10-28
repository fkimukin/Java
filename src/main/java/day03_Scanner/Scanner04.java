package day03_Scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter name , mid name , last name , and ssn");
        String fName = input.next();
        String mName = input.next();
        String lName = input.next();
        long ssn = input.nextLong();

        System.out.println(fName +" " +mName +" "+lName);
        System.out.println("SSN is = (" +ssn +")");
    }
}
