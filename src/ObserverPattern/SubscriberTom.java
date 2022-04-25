package ObserverPattern;

public class SubscriberTom implements Subscriber {

    public void update(Message m) {
        System.out.println("SubscriberTom :: " + m.getMessage());
    }

}
