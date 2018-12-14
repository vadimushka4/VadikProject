package day2.Inheritance;

public class Animal {

    protected String name = "Animal";
    private int age = 10;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public void say() {
        System.out.println("I am an Animal");
    }

    public void ebatb() {
        System.out.println("I am a 4MO");
    }
}
