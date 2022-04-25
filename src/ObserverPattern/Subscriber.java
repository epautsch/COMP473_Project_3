package ObserverPattern;

/* This class is the interface for the Observer, in our case a Subscriber */

public interface Subscriber {

    public void update(Message m);

}
