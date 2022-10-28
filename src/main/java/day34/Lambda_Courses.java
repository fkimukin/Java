package day34;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Courses {


        public static void main(String[] args) {
            Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
            Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
            Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
            Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

            List<Courses> coursesList = new ArrayList<>();
            coursesList.add(courseTurkishDay);
            coursesList.add(courseTurkishNight);
            coursesList.add(courseEnglishDay);
            coursesList.add(courseEnglishNight);
            System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(coursesList,95));
            System.out.println(chackIfAnyEleCourseNameContainsGivenWord(coursesList, "Turkish"));
            System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList));
            System.out.println(sortCourseWithAvgScoreInAscendingOrderSkipTheElementAccToGivenNum(coursesList,1));

        }

        public static boolean checkAvgScoresToBeGreaterThanGivenNumber(List<Courses> list , int num){

            return list.stream().allMatch(t-> t.getAverageScore()> num);

        }

       public static boolean chackIfAnyEleCourseNameContainsGivenWord(List<Courses> list , String txt){

            return list.stream().anyMatch(t-> t.getCourseName().contains(txt));

       }
public static String getCourseNameWhoseAvgIsTheHighest(List<Courses> list){

   return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();

}

public static List<Object> sortCourseWithAvgScoreInAscendingOrderSkipTheElementAccToGivenNum(List<Courses> list, int num){
            return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
}


    }