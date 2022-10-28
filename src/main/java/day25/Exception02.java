package day25;

public class Exception02 {

    public static void main(String[] args) {

        String a[] = {"A", "B", "D", "E", "F"};
        String r1 = getElement(a, 2);
        System.out.println(r1);

    }

    private static String getElement(String[] a, int i) {
        String s= "";
        try {
            s= a[i];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error occured");
        }
        return s;
    }
}