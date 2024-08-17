package in.vikasrajput.java.solid.isp.bad;

public class Aeroplane implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Aeroplane is accelerating on the runway.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Aeroplane is applying brakes after landing.");
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane is flying.");
    }
}
