package org.example.records;

public record PersonRecordToString(String name, int age, String email) {

    // Custom toString() method
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + " years, email=" + email + "]";
    }

    public static void main(String[] args) {
        PersonRecordToString personRecordToString = new PersonRecordToString("John Doe", 30, "john@example.com");
        System.out.println(personRecordToString); // Output: Person[name=John Doe, age=30 years, email=john@example.com]
    }
}
