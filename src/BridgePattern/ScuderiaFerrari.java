package BridgePattern;

/* This class is a concrete implementation of the F1Car abstraction */

public class ScuderiaFerrari extends F1Car {

    public ScuderiaFerrari(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("SuveriaFerrari has ");
        tires.tireMaterial();
    }
}
