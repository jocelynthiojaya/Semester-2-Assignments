public class PoliceCar implements IsLandVehicle, IsEmergency{
    String name;
    int maxPassengers;
    int maxSpeed;
    int numWheels;

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public PoliceCar(){};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Siren has been sounded.");
    }

    @Override
    public void drive() {
        System.out.println("Police Car is driving.");
    }

    @Override
    public String toString() {
        return "PoliceCar{" +
                "name='" + name + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", maxSpeed=" + maxSpeed +
                ", numWheels=" + numWheels +
                '}';
    }
}
