package day08;

public class q03stringManup {
    public static void main(String[] args) {
        String x= "$24.4";
        String xr= x.replace("$", "");
          Double a = Double.valueOf(xr);
        System.out.println(a);
        System.out.println(a+12.4);

    }
}
