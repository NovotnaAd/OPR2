public class SpeedSign extends Sign {
    private int maxSpeed;

    public SpeedSign(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean isViolated(Car car) {
        return car.getSpeed() > maxSpeed;
    }
}
