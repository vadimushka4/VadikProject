package day2.Inheritance;

public class Dog extends Animal {

    String name = "Dog";

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void say() {
        System.out.println("I am an dog");
    }

    public void eat() {
        System.out.println("I want my breakfast");
    }


}
