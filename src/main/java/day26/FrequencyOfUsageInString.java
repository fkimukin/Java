package day26;

public class FrequencyOfUsageInString {
    public static void main(String[] args) {


        String str = "java is good";
        String output = "";

        for (int i = 0; i < str.length();i++){
            int counter=0;
            for (int j= 0 ; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    counter++;

                }


            }
            System.out.println(str.charAt(i) + counter + " ");
        }





    }
}