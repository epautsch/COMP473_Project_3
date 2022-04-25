package VisitorPattern;

public class Vegetable implements Item {

    private int pricePerLb;
    private int weight;
    private String name;

    public Vegetable(int priceLb, int wt, String n) {
        pricePerLb = priceLb;
        weight = wt;
        name = n;
    }

    public int getPricePerLb() {
        return pricePerLb;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int accept(CartVisitor v) {
        return v.visit(this);
    }
}
