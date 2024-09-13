package org.example.npe;

public class NullPointerAfter {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress(new Address());

        try {
            // This will throw a NullPointerException
            System.out.println(person.getAddress().getCity().toUpperCase());
        } catch (NullPointerException e) {
            e.printStackTrace(); // Show detailed exception
        }
    }
}
