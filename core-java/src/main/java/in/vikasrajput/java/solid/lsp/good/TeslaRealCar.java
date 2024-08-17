package in.vikasrajput.java.solid.lsp.good;

public class TeslaRealCar extends RealCar {
    @Override
    public void fuel() {
        System.out.println("Tesla car is charged with electricity.");
    }

    @Override
    public void run() {
        System.out.println("Tesla car is running silently.");
    }

    @Override
    public void wheels() {
        System.out.println("Tesla car has 4 high-performance wheels.");
    }
}
