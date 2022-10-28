package day25;

public class Exception04 {

    public static void main(String[] args) {

        int r1 = convertStringToInt("12a");
        System.out.println(r1);


    }

    public static int convertStringToInt(String str) {
        int i = 0;
        try {
            i = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("converting error");

        }
        return i;
    }
}



