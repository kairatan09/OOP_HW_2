package HW2;

public class Boat extends Vehicle implements Swimmable {
    private final int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        this(id, brand, model, year, maxSpeed, false);
    }

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }

    @Override
    protected void startEngine() {
        System.out.println("Двигатель лодки запущен.");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Двигатель лодки заглушен.");
    }

    @Override
    protected void accelerate(int speed) {
        System.out.println("Скорость лодки увеличилась на " + speed + " км/ч.");
    }

    @Override
    protected void brake() {
        System.out.println("Лодка остановилась.");
    }

    @Override
    protected void displayInfo() {
        System.out.println("Лодка\n" + "ID: " + getId() +
                "\nМарка: " + getBrand() +
                "\nМодель: " + getModel() +
                "\nГод выпуска: " + getYear() +
                "\nМаксимальная скорость: " + getMaxSpeed() +
                "\nСостояние сейчас (в движении или нет): " + isSailing());
    }

    @Override
    public void startSwimming() {
        System.out.println("Лодка начала движение по воде.");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лодка прекатила движение по воде.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isSailing() {
        return isSailing;
    }

    public void setSailing(boolean sailing) {
        isSailing = sailing;
    }
}
