package org.example.records;

public record PersonAfter(String name, int age, String email) {

    public static void main(String[] args) {
        PersonAfter person = new PersonAfter("John Doe", 30, "john@example.com");
        System.out.println(person);
    }
}
