import java.util.ArrayList;
import java.util.List;

public class FineManager {
    public List<Fine> checkViolations(Car car, Location location) {
        List<Fine> fines = new ArrayList<>();

        for (Sign sign : location.getSigns()){
            if (sign.isViolated(car)){
                if (sign instanceof SpeedSign) {
                    fines.add(new Fine("Speeding", 2500));
                } else if (sign instanceof ProhibitorySign) {
                    fines.add(new Fine("Prohibited parking", 1200));
                } else if (sign instanceof DirectionSign) {
                    fines.add(new Fine("Prohibited direction", 1000));
                }
            }
        }
        return fines;
    }
}
