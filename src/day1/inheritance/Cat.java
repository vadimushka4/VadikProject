package day1.inheritance;

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
