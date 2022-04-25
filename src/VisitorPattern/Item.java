package VisitorPattern;

/* This class is the interface for the Element, in our case a grocery store Item */

public interface Item {

    int accept(CartVisitor v);

}
