package BridgePattern;

public class MercedesAMGPetronas extends F1Car {

    public MercedesAMGPetronas(Tire tireType) {
        super(tireType);
    }

    public void tiresOn() {
        System.out.print("MercedAmgPetronas has ");
        tires.tireMaterial();
    }
}
