package com.coffeeshop.naive;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jea
 * Responsibility: Data Persistence / Storage (Writing logs to disk)
 */
public class OrderRepository {

    private static final String FILE_PATH = "orders_log.txt";

    public void saveOrder(String customerName, String coffeeType, double finalPrice) {
        System.out.println("[Database] Saving transaction logs to disk...");
        
        // Use try-with-resources to automatically handle file closing cleanly
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write("Customer: " + customerName + " | Item: " + coffeeType + " | Total: PHP " + finalPrice + "\n");
            System.out.println("[Database] Log successfully written to " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("[CRITICAL ERROR] Failed to write to file system: " + e.getMessage());
        }
    }
}
Order repository ba sya??
Diane is typing
Diane is typing
Compose
