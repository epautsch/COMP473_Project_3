package ObserverPattern;

/* This is the interface for the Subject, in our case a Newspaper */

public interface Newspaper {

    public void attach(Subscriber s);
    public void detach(Subscriber s);
    public void notifyUpdate(Message m);
}
