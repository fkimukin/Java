package day28;

import java.util.Deque;
import java.util.LinkedList;

public class Queues02 {
    public static void main(String[] args) {

        Deque<String> furniture= new LinkedList<>();
        furniture.add("chair");
        furniture.add("miror");
        furniture.add("table");
        furniture.add("sofa");
        furniture.add("carpet");
        System.out.println(furniture);
        furniture.push("tv unit");
        System.out.println(furniture);














    }
}
