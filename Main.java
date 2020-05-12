public class Main {
    public static void main(String[] args) {
        PoliceCar A = new PoliceCar();
        A.name = "A";
        A.maxPassengers = 5;
        A.maxSpeed = 100;
        A.numWheels = 4;
        System.out.println(A.toString());
        A.drive();
        A.soundSiren();
    }
}
