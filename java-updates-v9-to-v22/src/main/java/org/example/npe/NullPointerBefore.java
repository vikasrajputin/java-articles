package org.example.npe;

//Make sure to run this program on java 8

// Run example from here: https://www.jdoodle.com/ia/1gSa
public class NullPointerBefore {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress(new Address());

        try {

            // This will throw a NullPointerException
            System.out.println(person.getAddress().getCity().toUpperCase());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
