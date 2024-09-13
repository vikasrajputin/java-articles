package org.example.stringtemplate;

public class JsonAfterJava13 {
    public static void main(String[] args) {
        String id = "123";
        String name = "John Doe";
        int age = 30;
        String email = "johndoe@example.com";
        boolean active = true;

        String json = """
                      {
                          "id": "%s",
                          "name": "%s",
                          "age": %d,
                          "email": "%s",
                          "active": %b
                      }
                      """.formatted(id, name, age, email, active);

        System.out.println("JSON After Java 13:\n" + json);
    }
}
