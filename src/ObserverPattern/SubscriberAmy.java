package ObserverPattern;

public class SubscriberAmy implements Subscriber {

    public void update(Message m) {
        System.out.println("SubscriberAmy :: " + m.getMessage());
    }

}
