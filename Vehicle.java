package HW2;

public abstract class Vehicle {
    private final int id;
    private final String brand;
    private final String model;
    private final int year;

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    protected void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    protected void stopEngine() {
        System.out.println("Двигатель заглушен.");
    }

    protected void accelerate(int speed) {
        System.out.println("Скорость увеличиалсь на " + speed + " км/ч.");
    }

    protected void brake() {
        System.out.println("Транспортное средство остановилось.");
    }
    protected abstract void displayInfo();

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}