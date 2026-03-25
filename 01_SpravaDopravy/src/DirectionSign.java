public class DirectionSign extends Sign {

    private CarAction allowedDirection;

    public DirectionSign(CarAction allowedDirection) {
        this.allowedDirection = allowedDirection;
    }

    @Override
    public boolean isViolated(Car car) {
        return car.getAction() != allowedDirection;
    }

    public CarAction getAllowedDirection() {
        return allowedDirection;
    }
}
