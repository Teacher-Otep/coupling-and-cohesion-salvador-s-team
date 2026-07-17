package com.coffeeshop.naive;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== COFFEE SHOP SYSTEM START ===");

        // 1. Initialize the individual high-cohesion classes
        TaxCalculator taxCalculator = new TaxCalculator();
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        OrderRepository orderRepository = new OrderRepository();

        // 2. Inject them into the controller (Loose Coupling)
        OrderController controller = new OrderController(taxCalculator, receiptPrinter, orderRepository);

        // 3. Define sample transaction data
        String customerName = "Diane";
        String coffeeType = "Caramel Macchiato";
        double basePrice = 150.00;

        // 4. Execute the order process flow
        controller.processOrder(customerName, coffeeType, basePrice);
    }
}