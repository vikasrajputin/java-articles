package org.example.stringtemplate;

public class JsonBeforeJava13 {
    public static void main(String[] args) {
        String id = "123";
        String name = "John Doe";
        int age = 30;
        String email = "johndoe@example.com";
        boolean active = true;

        String json = "{\n" +
                      "  \"id\": \"" + id + "\",\n" +
                      "  \"name\": \"" + name + "\",\n" +
                      "  \"age\": " + age + ",\n" +
                      "  \"email\": \"" + email + "\",\n" +
                      "  \"active\": " + active + "\n" +
                      "}";

        System.out.println("JSON Before Java 13:\n" + json);
    }
}
