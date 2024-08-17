package in.vikasrajput.java.solid.isp.bad;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Bus is applying brakes.");
    }

    @Override
    public void fly() {
        // Bus can't fly, so we provide a dummy implementation
        System.out.println("Bus can't fly.");
    }
}
