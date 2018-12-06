package day1.objects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car(130, "red", 2400);

        System.out.println(toyota.getSpeed() + toyota.getColour() + toyota.getPrice());

        toyota.setSpeed(190);
        toyota.setColour("Black");
        toyota.setPrice(3600);

        System.out.println(toyota.getSpeed() + toyota.getColour() + toyota.getPrice());

        Car[] cars = new Car[3];

        cars[0] = toyota;
        cars[1] = new Car(220, "white", 4000);
        cars[2] = new Car(230, "brown", 4200);

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getSpeed() + " " + cars[i].getColour() + " " + cars[i].getPrice());
        }

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(toyota);
        carsList.add(new Car(220, "white", 4000));
        carsList.add(new Car(230, "brown", 4200));

        for (int i = 0; i < carsList.size(); i++){
            System.out.println(carsList.get(i).getSpeed() + carsList.get(i).getColour() + carsList.get(i).getPrice());
        }
    }
}
