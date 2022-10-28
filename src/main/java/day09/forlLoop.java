package day09;

public class forlLoop {
    public static void main(String[] args) {
//        for (int i=68 ; i>12 ; i--){
//            if (i%2==1){
//            System.out.print(i + " ");}
//        }

//        for (int i =120 ; i >10; i-- ){   //divisible by 4 not divisible by 6
//            if (i%4==0 && i%6!=0) {
//                System.out.print(i +" ");
//            }

//        String str= "Java is good";
//        for (int i =0 ; i < str.length(); i++){
//            System.out.print(str.charAt(i));
//            if ( i < str.length() -1)
//                System.out.print("*");
//        }
        String str= "hello";
        for (int i = 0 ; i < str.length(); i++){
            if (str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }

    }
}
