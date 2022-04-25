package VisitorPattern;

public interface CartVisitor {

    int visit(Vegetable v);
    int visit(Fruit f);
    int visit(Bread b);

}
