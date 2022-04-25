package BridgePattern;

public class McLaren extends F1Car {

    public McLaren(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("McLaren has ");
        tires.tireMaterial();
    }
}
