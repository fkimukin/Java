package day15;

public class MultiDimentionalArr02 {
    public static void main(String[] args) {

        String[][] arr01= {{"Mia","Betül","Ali"},{"Fatih","Emine"}};
        for(String[] w : arr01){
            for (String a : w){
                if(a.contains("a")){
                    System.out.println(a + " contain 'a'");
                }
            }
        }



    }
}
