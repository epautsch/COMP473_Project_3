package ObserverPattern;

public class SubscriberBob implements Subscriber {

    public void update(Message m) {
        System.out.println("SubscriberBob :: " + m.getMessage());
    }

}
