package day12;

public class doWhile01 {
    public static void main(String[] args) {
        double num= 75.4218;
        String str= String.valueOf(num);
        String decpart= str.split("\\.")[1];
        String s="";
        int i = 0;

        do {
            String r = decpart.substring(i, i+1);
            s = s+"*"+r;
            i++;
        }while (i<decpart.length());
        System.out.println(s);
    }
}
