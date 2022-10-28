package Day29;

import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {

        Hashtable<String , Integer> countryPopulation= new Hashtable<>();
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("TR", 80000000);
        countryPopulation.put("DU", 12000000);
        countryPopulation.put("DN", 3000000);

        System.out.println(countryPopulation);


        Hashtable<String,Students> studentsInfo=new Hashtable<>();

    studentsInfo.put("Tom Hanks",new Students( "tomhanks@gmail.com" ,58,3,"American"));
    studentsInfo.put("Brad Pitt",new Students( "brad@gmail.com" ,58,4,"American"));
    studentsInfo.put("Angelina J",new Students( "ajolie@gmail.com" ,46,3,"American"));

        System.out.println(studentsInfo);

      Students bradInfo=studentsInfo.get("Brad Pitt");
      System.out.println(bradInfo.email);



    }


}
