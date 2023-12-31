package HW2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Delorean", "DMC-12", 1981, 52, 35);
        Airplane airplane = new Airplane(2, "Кукурузник", "Ан-2", 1971, 4200, true);
        Boat boat = new Boat(3, "Титаник", "401", 191, 23, true);

        car.displayInfo();
        car.startEngine();
        car.accelerate(60);
        car.brake();
        car.stopEngine();
        System.out.println("Сейчас в баке автомобиля " + car.getCurrentFuelLevel() + " литров топлива. Заправим его.");
        car.refuel(15);
        System.out.println("Теперь в баке автомобиля " + car.getCurrentFuelLevel() + " литров топлива.\n");

        airplane.displayInfo();
        airplane.land();
        airplane.brake();
        airplane.stopEngine();
        airplane.startEngine();
        airplane.takeOff();
        airplane.accelerate(700);
        System.out.println();

        boat.displayInfo();
        boat.stopSwimming();
        boat.brake();
        boat.stopEngine();
        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(10);
    }
}
