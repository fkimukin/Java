package day12;

public class static01 {

    //1)"static" class members (variables and methods) are common for all objects created from the class
    //2)When you do any update on "static" class members, all objects will see the updates on it
    //3)If you want every object informed about every update on a class member make it static.

    //to make a variable "static", put static ketword between access modifiler and data type
    public static int staticCounter =0;
    public int nonstaticCounter=0;
    public static01(){
        staticCounter++;
        nonstaticCounter++;

    }
}
