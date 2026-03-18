public class Car {
    private String licensePlate;
    private int speed;
    private CarAction action;

    public Car(String licensePlate, int speed, CarAction action) {
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.action = action;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getSpeed() {
        return speed;
    }

    public CarAction getAction() {
        return action;
    }
}
