package org.example.records;

public record PersonRecordEquals(String name, int age, String email) {

    // Custom equals() method that only compares the name and email fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonRecordEquals personRecordEquals)) return false;
        return name.equals(personRecordEquals.name) && email.equals(personRecordEquals.email);
    }

    public static void main(String[] args) {
        PersonRecordEquals personRecordEquals1 = new PersonRecordEquals("John Doe", 30, "john@example.com");
        PersonRecordEquals personRecordEquals2 = new PersonRecordEquals("John Doe", 25, "john@example.com");
        System.out.println(personRecordEquals1.equals(personRecordEquals2)); // Output: true (age is not considered)
    }
}
