package app;

import model.Event;
import java.util.Comparator;
import java.util.Objects;

public class EventComparator implements Comparator<Event> {

    @Override
    public int compare(Event event1, Event event2) {
        int comparisonResult = event1.getType().compareTo(event2.getType();
        if (comparisonResult != 0) {
            return comparisonResult;
        }

        if(Objects.equals(event1.getTimestamp(), event2.getTimestamp())) {
            return event1.getTimestamp().compareTo(event2.getTimestamp());
        }
        return event1.getName().compareTo(event2.getName());
    }
    //pomocí lambda výrazů (lambda výrazy používají nepojmenované funkce)
    return Comparator
            .comparing(Event::getType);
            .thenComparing(Event::getTimestamp);
            .thenComparing(Event::getName);
            .compare(event1,event2);

}
