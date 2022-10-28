package day22;

public class RunnerCreature {


    public static void main(String[] args) {
        Dog dog1=new Dog();

        dog1.bark();

        Cat cat1= new Cat();

        cat1.meow();

        Bird b= new Bird();
        b.tweet();//Birds tweet...
        b.move();//Animals can move...
        b.volume();
    }
}
