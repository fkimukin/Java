package day09;

public class stringManuplationLoops {
    public static void main(String[] args) {
        String str = "Java is easy. Java is OOP.";
        String result1 = str.replaceFirst("Java", "Apex");
        System.out.println(result1);
        String result2 = str.replace("Java", "Apex");
        System.out.println(result2);


        // swamp
        int x=14, y=25;
        y=y-x;
        x=y+x;
        y=x-y;
        System.out.println(x+" "+ y );
    }
}