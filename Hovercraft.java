public class Hovercraft implements IsLandVehicle, IsSeaVessel{
    String name;
    int maxPassengers;
    int maxSpeed;
    int numWheels;
    int displacement;

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
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void drive() {
        System.out.println("Hovercraft is driving.");
    }

    @Override
    public void launch() {
        System.out.println("Hovercraft is launched.");
    }

    public void enterLand(){
        System.out.println("Hovercraft has entered land.");
    }

    public void enterSea(){
        System.out.println("Hovercraft has entered sea.");
    }
}
