package BridgePattern;

/* This class is the abstraction */

abstract public class F1Car {

    public Tire tires;

    public F1Car(Tire tireType) {
        this.tires = tireType;
    }

    public abstract void tiresOn();
}
