package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


public class WallStreetJournal implements Newspaper {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void attach(Subscriber s) {
        subscribers.add(s);
    }

    public void detach(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifyUpdate(Message m) {
        for (Subscriber s :
                subscribers) {
            s.update(m);
        }
    }

}
