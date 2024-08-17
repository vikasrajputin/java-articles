package in.vikasrajput.java.solid.lsp.good;

public class TeslaToyCar extends Car {
    @Override
    public void run() {
        System.out.println("Tesla toy car is running with battery power.");
    }

    @Override
    public void wheels() {
        System.out.println("Tesla toy car has 4 small plastic wheels.");
    }
}
