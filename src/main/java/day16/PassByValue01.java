package day16;

public class PassByValue01 {

    public static void main(String[] args) {
        int price = 20;
        price = change(price);
        System.out.println(price);//40
    }

    public static int change(int a){
        return a*2;
    }
}