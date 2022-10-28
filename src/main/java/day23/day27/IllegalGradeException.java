package day23.day27;

public class IllegalGradeException extends Exception {

    public IllegalGradeException(String s) {
        super(s);
    }

    public static void main(String[] args) {
        try {
            printGrades(-45);
        } catch (IllegalGradeException e) {
            e.printStackTrace();
        }
        System.out.println("tom");
    }


    public static void printGrades(double grade) throws IllegalGradeException{


        if (grade<0 || grade>100){
            throw new IllegalGradeException("grade cannot be less than zero and more than hundred");

        }else {
            System.out.println(grade);
        }
    }
public static boolean checkNameFormat(String name){

        if (name.charAt(0)>='A' || name.charAt(0)<='Z'){
            return true;

        }else {
            throw new IllegalNameException("Name must start with uppercase");
        }
}

}
