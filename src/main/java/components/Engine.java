package components;

public class Engine {

    private int horsePower;
    private String fuelType;
    private int engineSize;

    public Engine(int horsePower, String fuelType, int engineSize) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineSize() {
        return engineSize;
    }
}
