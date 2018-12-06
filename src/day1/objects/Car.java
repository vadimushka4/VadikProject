package day1.objects;

public class Car {


    private int speed;
    private String colour;
    private int price;

    public Car(int speed, String colour, int price) {
        this.speed = speed;
        this.price = price;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
