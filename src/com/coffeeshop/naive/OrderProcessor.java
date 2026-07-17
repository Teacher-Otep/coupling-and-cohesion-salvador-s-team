/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

import java.io.FileWriter;
import java.io.IOException;

public class OrderProcessor {
    
    public void processOrder(String customerName, String coffeeType, double price) {
        // --- RESPONSIBILITY 1: Business Logic & Tax Calculations ---
        System.out.println("[System] Calculating final totals...");
        double localTax = 0.12; // Hardcoded 12% VAT
        double finalPrice = price + (price * localTax);
        
        // --- RESPONSIBILITY 2: Presentation & Formatting ---
        System.out.println("\n===== COFFEE SHOP RECEIPT =====");
        System.out.println("Customer: " + customerName);
        System.out.println("Beverage: " + coffeeType);
        System.out.println("Total Amount (incl. Tax): PHP " + finalPrice);
        System.out.println("================================\n");
        
        // --- RESPONSIBILITY 3: Data Persistence & Storage ---
        System.out.println("[System] Saving transaction logs to disk...");
        FileWriter writer = null;
        try {
            // Hardcoded local text file deployment
            writer = new FileWriter("orders_log.txt", true);
            writer.write("Customer: " + customerName + " | Item: " + coffeeType + " | Total: " + finalPrice + "\n");
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