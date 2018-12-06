package day1.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

    Animal deer = new Animal();

        System.out.println(deer.getName() + deer.getAge());
        deer.say();
        deer.ebatb();

        Dog pidbull = new Dog();

        System.out.println(pidbull.getName() + pidbull.getAge());
        pidbull.say();
        pidbull.ebatb();
        pidbull.eat();

        Cat penis = new Cat();

        System.out.println(penis.getName() + penis.getAge());
        penis.say();
        penis.ebatb();


        System.out.println("");

        printAnimal(penis);

    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal.getName() + animal.getAge());
        animal.say();
        animal.ebatb();
    }
}
