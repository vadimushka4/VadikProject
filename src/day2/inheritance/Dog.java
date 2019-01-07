package day2.inheritance;

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

    @Override
    public void ebatb() {

    }

    public void eat() {
        System.out.println("I want my breakfast");
    }


}
