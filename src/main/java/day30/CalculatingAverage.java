package day30;

public class CalculatingAverage {

    public static void calculatingAverage(String stdName,double... mark){

        double sum=0;
        for (double w: mark){
            sum+= w;
        }
        System.out.println(stdName+"'s average of exams : "+ String.format("%.2f",sum/mark.length));
    }

    public static void main(String[] args) {
        calculatingAverage("fatih", 3.58,3.12,2.75);
    }
}
