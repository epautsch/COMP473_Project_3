import BridgePattern.*;
import ObserverPattern.*;
import VisitorPattern.*;

/* This is a driver class to test our Pattern implementations */

public class PatternsMain {

    public static void main(String[] args) {
//        Demonstrating bridge pattern
        F1Car c1 = new MercedesAMGPetronas(new SoftTires());
        c1.tiresOn();
        F1Car c2 = new ScuderiaFerrari(new MediumTires());
        c2.tiresOn();
        F1Car c3 = new McLaren(new HardTires());
        c3.tiresOn();

//        Demonstrating observer pattern
        Subscriber s1 = new SubscriberAmy();
        Subscriber s2 = new SubscriberBob();
        Subscriber s3 = new SubscriberTom();
        Newspaper n = new WallStreetJournal();
        n.attach(s1);
        n.attach(s2);
        n.notifyUpdate(new Message("First Message"));
        n.detach(s1);
        n.attach(s3);
        n.notifyUpdate(new Message("Second Message"));

//        Demonstrating visitor pattern
        Item[] items = new Item[]{new Bread(25, "Rye"),
                                new Bread(100, "Sourdough"),
                                new Fruit(12, 2, "Mango"),
                                new Vegetable(5, 5, "Broccoli"),
                                new Vegetable(3, 10, "Potato"),
                                new Fruit(4, 5, "Strawberry")};
        int total = calcPrice(items);
        System.out.println("Totatl cost = " + total);
    }

    private static int calcPrice(Item[] items) {
        CartVisitor v = new CartVisitorImpl();
        int sum = 0;
        for (Item i :
                items) {
            sum = sum + i.accept(v);
        }
        return sum;
    }
}
