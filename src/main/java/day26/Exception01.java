package day26;

public class Exception01 {


    public static void main(String[] args) {

    printAge(25);

    try{
        printAge(-25);
    }catch (IllegalArgumentException e){
        System.out.println("age is not valid ");
    }
        System.out.println("code working");

    }





    public static void printAge(int age){

        if(age<0){
            throw new IllegalArgumentException();
        }
        System.out.println(age);


    }





}
