package in.vikasrajput.java.solid.isp.good;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Bus is applying brakes.");
    }
}
