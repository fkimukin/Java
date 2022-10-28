package day18;

public class StringBuilderAccessModifier01 {

    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Mississipi");

        System.out.println(sb1);

        String test = sb1.toString();
        System.out.println(test);

       StringBuilder revSb1= sb1.reverse();
        System.out.println(revSb1);

        sb1.deleteCharAt(8);
        System.out.println(sb1);

        sb1.delete(2, 5);
        System.out.println(sb1);

        sb1.replace(2,4,"is");
        System.out.println(sb1);

        sb1.insert(3,"xxx");
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder("Java is Love");
        StringBuilder sb3= new StringBuilder("Java is Love");

        System.out.println(sb2.compareTo(sb3));

        sb3.setCharAt(8,'n');
        System.out.println(sb3);






    }
}
