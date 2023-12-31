package HW2;

public class Airplane extends Vehicle implements Flyable {
    private final int maxAltitude;
    private boolean isFlying;
    public Airplane(int id, String brand, String model, int year, int maxAltitude) {
        this(id, brand, model, year, maxAltitude, false);
    }

    public Airplane(int id, String brand, String model, int year, int maxAltitude, boolean isFlying) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    @Override
    protected void startEngine() {
        System.out.println("Двигатель самолета запущен.");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Двигатель самолета заглушен.");
    }

    @Override
    protected void accelerate(int speed) {
        System.out.println("Скорость самолета увеличилась на " + speed + " км/ч.");
    }

    @Override
    protected void brake() {
        System.out.println("Самолет остановился.");
    }

    @Override
    protected void displayInfo() {
        System.out.println("Самолёт\n" + "ID: " + getId() +
                "\nМарка: " + getBrand() +
                "\nМодель: " + getModel() +
                "\nГод выпуска: " + getYear() +
                "\nМаксимальная высота полета: " + getMaxAltitude() +
                "\nСостояние сейчас (в полете или нет): " + isFlying());
    }

    @Override
    public void takeOff() {
        System.out.println("Самолет взлетел.");
    }

    @Override
    public void land() {
        System.out.println("Самолет сел.");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}
