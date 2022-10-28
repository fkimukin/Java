package day28;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> wareHouse= new LinkedList<>();
        wareHouse.add("milk");
        wareHouse.add("potato");
        wareHouse.add("meat");
        wareHouse.add("honey");
        wareHouse.add("tomato");
        System.out.println(wareHouse);
String el1= wareHouse.poll();
        System.out.println(el1);

        String el2= wareHouse.peek();
        System.out.println(el2);
        System.out.println(wareHouse);
        String el3= wareHouse.element();
        System.out.println(el3);
        System.out.println(wareHouse);

        Queue<String> emptyWareHouse= new LinkedList<>();
        String el4 =emptyWareHouse.peek();
        System.out.println(el4);
        String el5 =emptyWareHouse.element();//no such element exception
        System.out.println(el5);
       boolean result1= wareHouse.offer("chocolate");
        System.out.println(result1);



        String el6= wareHouse.remove();
        System.out.println(el6);

        String el7= emptyWareHouse.poll();
        System.out.println(el7);

        String el8= emptyWareHouse.remove();
        System.out.println(el8);











    }


}
