package DAY13;

public class static01 {

    public static double pi; //defoult value is 0 or 0.0 for string is null , for bolean is false

    public static void main(String[] args) {
        System.out.println("the main method");
    }
    static {
        pi= 3.14;
        System.out.println("static 1");
    }
    static {
        System.out.println("static 2");
    }

}
