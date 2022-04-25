package VisitorPattern;

/* This class is a concrete implementation of a CartVisitor (Visitor) */

public class CartVisitorImpl implements CartVisitor {

    public int visit(Bread b) {
        int cost = 0;

        if (b.getPrice() > 50) {
            cost = b.getPrice() - 5;
        } else {
            cost = b.getPrice();
        }

        System.out.println("Bread id: " + b.getItemID() + " cost = " + cost);
        return cost;
    }

    public int visit(Vegetable v) {
        int cost = v.getPricePerLb() * v.getWeight();

        System.out.println(v.getName() + " cost = " + cost);

        return cost;
    }

    public int visit(Fruit f) {
        int cost = f.getPricePerLb() * f.getWeight();

        System.out.println(f.getName() + " cost = " + cost);

        return cost;

    }
}
