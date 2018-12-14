package day2.Inheritance;

public class Cat extends Animal {


    String name = "Cat";

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void say() {
        System.out.println("I am an cat");
    }

}
