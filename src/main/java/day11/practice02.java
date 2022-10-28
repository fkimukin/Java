package day11;

public class practice02 {
    public static void main(String[] args) {
        String num = "Nalan";
        String revers = "";
        int i = num.length()-1;
    while (i>=0){
        revers = revers + num.charAt(i);
        i--;
    }
    if (revers.toLowerCase().equals(num.toLowerCase())){
        System.out.println("It is palindrome");
    }else {
        System.out.println("not palindrome");
    }
    }
}
