package BridgePattern;

/* This class is a concrete implementation of the F1Car abstraction */

public class McLaren extends F1Car {

    public McLaren(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("McLaren has ");
        tires.tireMaterial();
    }
}
