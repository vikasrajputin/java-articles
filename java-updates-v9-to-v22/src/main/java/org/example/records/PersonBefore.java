package org.example.records;

import java.util.Objects;

public class PersonBefore {
    private final String name;
    private final int age;
    private final String email;

    // Constructor
    public PersonBefore(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // toString method
    @Override
    public String toString() {
        return "PersonBefore{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonBefore that = (PersonBefore) o;
        return age == that.age &&
               Objects.equals(name, that.name) &&
               Objects.equals(email, that.email);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    public static void main(String[] args) {
        PersonBefore person = new PersonBefore("John Doe", 30, "john@example.com");
        System.out.println(person);
    }
}
