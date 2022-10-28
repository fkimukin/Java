package day22;

public class Animal extends Creatures{

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void move(){
        System.out.println("Animals can move...");
    }


    @Override
    public void volume() {
        System.out.println("all animals have volume");
    }
}
