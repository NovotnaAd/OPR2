public class Main {
    public static void main(String[] args) {
        Car car = new Car("BN666K", 80, CarAction.TURN_LEFT);

        Location location = new Location("Křižovatka");
        location.addSign(new SpeedSign(50));
        location.addSign(new DirectionSign(CarAction.STRAIGHT));
        location.addSign(new ProhibitorySign(CarAction.TURN_LEFT));

        FineManager manager = new FineManager();
        var fines = manager.checkViolations(car, location);

        for (Fine fine : fines) {
            System.out.println(fine);
        }
    }
}
