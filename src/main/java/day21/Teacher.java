package day21;

public class Teacher {
    public static void main(String[] args) {

        add(3, 5.0);
        add(8);
        add(3.0, 5);

    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void add(int a){
        System.out.println(a);
    }

    public static void add(double a){
        System.out.println(a);
    }

}
