package day15;

public class MultiDimentionalArrList01 {
    public static void main(String[] args) {

        int[][] arr01= {{5,0},{-2,4},{65,-12,23}};

        int max= 0;
        for (int[] a: arr01){
            for (int b : a) {
//                if (b>max){
//                    max = b;
//              }
              max = Math.max(max,b);

            }
        }
        System.out.println(max);

    }
}
