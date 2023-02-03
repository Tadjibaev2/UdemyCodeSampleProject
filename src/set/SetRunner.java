package set;

import java.util.*;

public class SetRunner {

    public static void main(String[] args) {

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 35));
        sixCars.add(new Car("Audi", "A4", 60));
        sixCars.add(new Car("VW", "Polo", 25));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Logan", 30));
        europaCars.add(new Car("Reno", "Megane", 50));
        europaCars.add(new Car("VW", "Golf", 35));
        europaCars.add(new Car("VW", "Polo", 25));


        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);

        SortedSet<Car> cars = uniqueCars.subSet(new Car("Toyota", "Auris", 40), true, new Car("Audi", "A4", 60), true);


        print(uniqueCars);

        System.out.println("Higher");
        System.out.println(uniqueCars.higher(new Car("Toyota", "Auris", 40)));
        System.out.println("Lower");
        System.out.println(uniqueCars.lower(new Car("Toyota", "Auris", 40)));

        System.out.println("floor");
        System.out.println(uniqueCars.floor(new Car("Toyota", "Auris", 39)));


    }

    private static void print(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
