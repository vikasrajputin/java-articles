package in.vikasrajput.java.solid.dip.bad;

public class Service {
    private SQLRepository repository = new SQLRepository();

    public void save() {
        repository.save();
        System.out.println("Service operation completed.");
    }
}
