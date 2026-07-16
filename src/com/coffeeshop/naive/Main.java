/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coffeeshop.naive;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Naive Coffee Shop System ===");
        
        OrderProcessor processor = new OrderProcessor();
        
        // Simulating a customer ordering a Java Chip Frappe
        // Parameters: Customer Name, Coffee Item, Base Price
        processor.processOrder("Juan Dela Cruz", "Java Chip Frappe", 150.0);
        
        System.out.println("\n=== Order Processing Complete ===");
    }
}
