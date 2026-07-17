package com.coffeeshop.naive;

import java.io.FileWriter;
import java.io.IOException;

public class OrderProcessor {
    
    public void processOrder(String customerName, String coffeeType, double price) {
        // --- RESPONSIBILITY 1: Business Logic & Tax Calculations (Naively Hardcoded) ---
        System.out.println("[System] Calculating final totals...");
        double localTax = 0.12; // Hardcoded 12% VAT
        double finalPrice = price + (price * localTax);
        
        // --- RESPONSIBILITY 2: Presentation & Formatting (Naively Hardcoded) ---
        System.out.println("\n========================================");
        System.out.println("            COFFEE SEED CAFE            ");
        System.out.println("========================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Item Ordered  : " + coffeeType);
        System.out.println("----------------------------------------");
        System.out.printf("Total Amount  : PHP %.2f (incl. 12%% VAT)\n", finalPrice);
        System.out.println("========================================");
        System.out.println("         Thank you! Please come again!  ");
        System.out.println("========================================\n");
        
        // --- RESPONSIBILITY 3: Data Persistence & Storage (Naively Hardcoded) ---
        System.out.println("[System] Saving transaction logs to disk...");
        FileWriter writer = null;
        try {
            writer = new FileWriter("orders_log.txt", true);
            writer.write("Customer: " + customerName + " | Item: " + coffeeType + " | Total: PHP " + finalPrice + "\n");
            System.out.println("[Database] Log successfully written to orders_log.txt");
        } catch (IOException e) {
            System.out.println("[CRITICAL ERROR] Failed to write to file system: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}