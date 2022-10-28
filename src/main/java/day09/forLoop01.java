package day09;

public class forLoop01 {
    public static void main(String[] args) {
//        String name = "Mark";
//        String reversedName= "";
//        for ( int i = name.length()-1; i >=0; i--){
//            char ch = name.charAt(i);
//            reversedName = reversedName + ch;
//        }
//        System.out.println(reversedName);


//        int sum = 0;
//        for ( int num= 3 ;num <7; num++) {
//           sum = sum + num;
//            System.out.println(sum);
//        }
//        System.out.println("result = "+sum );

//        int multy = 1;
//        for ( int num= 3 ;num <7; num++) {
//            multy = multy + num;
//            System.out.println(multy);
//        }
//        System.out.println("result = "+multy );

        //Example 4: Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sumOfDigits= 0;
        int num= -584;

        num= Math.abs(num);

        for (int i=num; i>0; i=i/10){

            sumOfDigits= sumOfDigits + i%10;
        }

        System.out.println(sumOfDigits);
    }
}
