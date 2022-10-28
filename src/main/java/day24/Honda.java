package day24;

public class Honda implements Ac, Brake, Engine{

    @Override
    public void digital() {
        System.out.println("this is digital AC");
    }

    @Override
    public void secureBrake() {
        System.out.println("this is Brake");
    }

    @Override
    public void ecoEngine() {
        System.out.println("this is EcoEngine");
    }

    @Override
    public void price() {
        System.out.println("100000");
    }


}
