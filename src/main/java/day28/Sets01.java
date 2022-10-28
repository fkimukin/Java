package day28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    public static void main(String[] args) {
        HashSet<String> emails= new HashSet<>();
        System.out.println(emails);

        emails.add("apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("apple");
        emails.add(null);
        System.out.println(emails);
        emails.remove("Fig");

        Object email2= emails.clone();
HashSet<String> email3= (HashSet<String>) emails.clone();


        LinkedHashSet<Integer> ssn= new LinkedHashSet<>();
       ssn.add(123325233);
        ssn.add(223325233);
        ssn.add(323325233);
        ssn.add(423325233);
        System.out.println(ssn);
//Slower
        Long starting= System.currentTimeMillis();
        TreeSet<Integer> nums= new TreeSet<>();
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(3);
        nums.add(6);
        System.out.println(nums);
        Long middle= System.currentTimeMillis();
//faster
        HashSet<Integer> nums2=new HashSet<>();
        nums2.add(5);
        nums2.add(2);
        nums2.add(8);
        nums2.add(3);
        nums2.add(6);
        TreeSet<Integer> perfNums= new TreeSet<>(nums2);
        System.out.println(perfNums);
        Long end= System.currentTimeMillis();
        System.out.println(middle - starting );
        System.out.println(end - middle);
    }



}
