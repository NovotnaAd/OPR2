import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private List<Sign> signs;

    public Location(String name) {
        this.name = name;
        this.signs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Sign> getSigns() {
        return signs;
    }

    public void addSign (Sign sign){
        signs.add(sign);
    }
}
