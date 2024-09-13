package org.example.records;

public record PersonRecordCustomConstructor(String name, int age, String email) {

    // Custom constructor with validation
    public PersonRecordCustomConstructor {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public static void main(String[] args) {
        try {
            PersonRecordCustomConstructor person = new PersonRecordCustomConstructor("John Doe", -5, "john@example.com");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Output: Age cannot be negative
        }
    }
}
