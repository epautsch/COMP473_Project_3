package BridgePattern;

/* This class is a concrete implementation of the F1Car abstraction */

public class MercedesAMGPetronas extends F1Car {

    public MercedesAMGPetronas(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("MercedAmgPetronas has ");
        tires.tireMaterial();
    }
}
