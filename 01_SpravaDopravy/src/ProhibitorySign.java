public class ProhibitorySign extends Sign {
    private CarAction prohibitedAction;

    public ProhibitorySign(CarAction prohibitedAction) {
        this.prohibitedAction = prohibitedAction;
    }

    @Override
    public boolean isViolated(Car car) {
        return car.getAction() == prohibitedAction;
    }
}
