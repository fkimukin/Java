package day09;

public class strstring {
    public static void main(String[] args) {
        String pwd = "xy1AmSW?";
        boolean firstRule = pwd.contains("A");
        boolean secondRule = pwd.contains("xy");
        boolean thirdRule= pwd.contains("W");
        boolean fourthRule = pwd.length()==8;
        System.out.println("Is password valid ? "+(firstRule && secondRule && thirdRule && fourthRule));
String s = "do more practice";
String t = s+"!";
        System.out.println(t);
        String u = t.concat("!").concat("??"); //same method
        System.out.println(u);

    }
}
