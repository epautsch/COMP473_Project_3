package VisitorPattern;

/* This class is a concrete implementation of an Item (Element) */

public class Bread implements Item {

    private int price;
    private String itemID;

    public Bread(int cost, String id) {
        price = cost;
        itemID = id;
    }

    public int getPrice() {
        return price;
    }

    public String getItemID() {
        return itemID;
    }

    public int accept(CartVisitor v) {
        return v.visit(this);
    }
}
