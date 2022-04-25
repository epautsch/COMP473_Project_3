package VisitorPattern;

/* This class is the interface for the Visitor, in our case a grocery cart visitor */

public interface CartVisitor {

    int visit(Vegetable v);
    int visit(Fruit f);
    int visit(Bread b);

}
