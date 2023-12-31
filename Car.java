package HW2;

public class Car extends  Vehicle {
    private final int fuelCapacity;
    private int currentFuelLevel;
    private int liters;


    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public Car(int id, String brand, String model, int year) {
        this(id, brand, model, year, 0, 0);
    }

    @Override
    protected void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Двигатель автомобиля заглушен.");
    }

    @Override
    protected void accelerate(int speed) {
        System.out.println("Скорость автомобиля увеличилась на " + speed + " км/ч.");
    }

    @Override
    protected void brake() {
        System.out.println("Автомобиль остановился.");
    }

    @Override
    protected void displayInfo() {
        System.out.println("Автомобиль\n" + "ID: " + getId() +
                           "\nМарка: " + getBrand() +
                           "\nМодель: " + getModel() +
                           "\nГод выпуска: " + getYear() +
                           "\nЁмкость топливного бака: " + getFuelCapacity() +
                           "\nТоплива сейчас: " + getCurrentFuelLevel());
    }

    protected void refuel(int liters) {
        this.liters = liters;
        if (liters < fuelCapacity - currentFuelLevel) {
            setCurrentFuelLevel(currentFuelLevel + liters);
        } else {
            setCurrentFuelLevel(fuelCapacity);
        }
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
}
