package org.example.records;

public record PersonRecordArgConstructor(String name, int age, String email) {

    // Custom constructor that provides default values
    public PersonRecordArgConstructor(String name, String email) {
        this(name, 18, email); // Default age is 18 if not provided
    }

    public static void main(String[] args) {
        PersonRecordArgConstructor personRecordArgConstructor1 = new PersonRecordArgConstructor("John Doe", 30, "john@example.com");
        PersonRecordArgConstructor personRecordArgConstructor2 = new PersonRecordArgConstructor("Jane Doe", "jane@example.com");

        System.out.println(personRecordArgConstructor1); // Output: Person[name=John Doe, age=30, email=john@example.com]
        System.out.println(personRecordArgConstructor2); // Output: Person[name=Jane Doe, age=18, email=jane@example.com]
    }
}
