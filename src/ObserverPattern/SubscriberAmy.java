package ObserverPattern;

/* This class is a concrete implementation of the Subscriber (Observer) interface */

public class SubscriberAmy implements Subscriber {

    public void update(Message m) {
        System.out.println("SubscriberAmy :: " + m.getMessage());
    }

}
