package tasks.task2;

public class Animal {
    String name;
    int age;

    public  Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  Animal() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("тварь хочет жрать!!!");
    }
}
