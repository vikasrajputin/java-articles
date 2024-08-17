package in.vikasrajput.java.solid.lsp.bad;

public class TeslaToyCar extends Car {
    @Override
    public void fuel() {
        // This is where the problem occurs.
        // Toy cars do not need fueling, so this method throws an exception.
        throw new IllegalStateException("Tesla toy car doesn't need fuel.");
    }

    @Override
    public void run() {
        System.out.println("Tesla toy car is running with battery power.");
    }

    @Override
    public void wheels() {
        System.out.println("Tesla toy car has 4 small plastic wheels.");
    }
}
