import java.util.ArrayList;
import java.util.List;

public class FineManager {

    public List<Fine> checkViolations(Car car, Location location) {
        List<Fine> fines = new ArrayList<>();

        for (Sign sign : location.getSigns()) {
            if (sign.isViolated(car)) {

                if (sign instanceof SpeedSign ss) {
                    fines.add(new Fine(
                            "Speeding (max " + ss.getMaxSpeed() + ")",
                            2500
                    ));

                } else if (sign instanceof ProhibitorySign ps) {
                    fines.add(new Fine(
                            "Prohibited action: " + ps.getProhibitedAction(),
                            1200
                    ));

                } else if (sign instanceof DirectionSign ds) {
                    fines.add(new Fine(
                            "Wrong direction: expected " + ds.getAllowedDirection(),
                            1000
                    ));
                }
            }
        }

        return fines;
    }
}
