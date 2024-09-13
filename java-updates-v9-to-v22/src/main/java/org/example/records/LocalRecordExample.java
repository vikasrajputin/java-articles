package org.example.records;

import java.util.List;

public class LocalRecordExample {

    public static void main(String[] args) {
        // List of products with names and prices
        List<String> products = List.of("Laptop,1000", "Phone,600", "Tablet,300");

        // Process the products using a local record
        processProducts(products);
    }

    public static void processProducts(List<String> products) {
        // Declare a local record inside the method
        record Product(String name, double price) {}

        // Iterate through each product
        for (String productInfo : products) {
            String[] info = productInfo.split(",");

            // Create an instance of the local record
            Product product = new Product(info[0], Double.parseDouble(info[1]));

            // Use the record for temporary processing
            System.out.println("Product Name: " + product.name());
            System.out.println("Product Price: $" + product.price());
        }
    }
}
