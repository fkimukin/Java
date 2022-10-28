package day17;

public class VarArgs01 {


    public static void main(String[] args) {

        /*
        If you want to make the parameters limit flexible in a method, use "VarArgs".
        To create VarArgs "Data type + ... + space + a name for the varargs"
        VarArgs use Arrays behind. When you work with varargs, you can think you are working with arrays.
        VarArgs can accept zero or more elements

         */

        System.out.println(add(3, 5)); //8
        System.out.println(add(56,95,45));//196
        System.out.println(add(78,45,62,89,210,78));//562

    }

    public static int add(int... a){

        int sum=0;

        for(int w: a){

            sum= sum+w;

        }
        return sum;

    }






}