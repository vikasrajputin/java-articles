package in.vikasrajput.java.solid.dip.good;

public class NoSQLRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Data saved to NoSQL database.");
    }
}
