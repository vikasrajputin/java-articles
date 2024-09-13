package org.example.stringtemplate;

public class JsonAfterJava21 {
    public static void main(String[] args) {
        String id = "123";
        String name = "John Doe";
        int age = 30;
        String email = "johndoe@example.com";
        boolean active = true;

        // Using string templates inside a text block
        String json = STR."""
                          {
                              "id": "\{id}",
                              "name": "\{name}",
                              "age": \{age},
                              "email": "\{email}",
                              "active": \{active}
                          }
                          """;

        System.out.println("JSON After Java 21:\n" + json);
    }
}
