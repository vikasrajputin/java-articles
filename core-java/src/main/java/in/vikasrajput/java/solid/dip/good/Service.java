package in.vikasrajput.java.solid.dip.good;

public class Service {
    private Repository repository;

    // The repository is injected via the constructor
    public Service(Repository repository) {
        this.repository = repository;
    }

    public void save() {
        repository.save();
        System.out.println("Service operation completed.");
    }
}
