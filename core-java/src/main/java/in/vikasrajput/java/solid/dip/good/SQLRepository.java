package in.vikasrajput.java.solid.dip.good;

public class SQLRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Data saved to SQL database.");
    }
}
