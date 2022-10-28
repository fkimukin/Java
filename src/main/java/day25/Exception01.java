package day25;

public class Exception01 {

    public static void main(String[] args) {

        divide(6,2);
    }


    public static void divide(int a, int b){


     try{System.out.println(a/b);
     }
     catch (ArithmeticException e){
         System.out.println("problem occured");
     }

    }

}
