package BridgePattern;

public class ScuderiaFerrari extends F1Car {

    public ScuderiaFerrari(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("SuveriaFerrari has ");
        tires.tireMaterial();
    }
}
