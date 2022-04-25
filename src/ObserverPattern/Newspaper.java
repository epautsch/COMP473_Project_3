package ObserverPattern;


public interface Newspaper {

    public void attach(Subscriber s);
    public void detach(Subscriber s);
    public void notifyUpdate(Message m);
}
