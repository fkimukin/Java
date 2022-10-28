package day22;

public class Dog extends Animal{

    public void bark(){
        super.consume();
        super.volume();
        System.out.println("Dogs bark...");
    }



}
