package org.example.sealedclass;

public class RemoteContractualEmployee extends ContractualEmployee {
    private final String location;

    public RemoteContractualEmployee(String name, double salary, String location) {
        super(name, salary,1);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
