package com.coffeeshop.naive;

/**
 * @author Apatas
 * Responsibility: Controller (Coordinating the flow of order processing)
 */
public class OrderController {
    
    // Dependencies are kept private and final (Loose Coupling)
    private final TaxCalculator taxCalculator;
    private final ReceiptPrinter receiptPrinter;
    private final OrderRepository orderRepository;

    // Constructor Dependency Injection (Passing the required tools to the controller)
    public OrderController(TaxCalculator taxCalculator, ReceiptPrinter receiptPrinter, OrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.receiptPrinter = receiptPrinter;
        this.orderRepository = orderRepository;
    }

    public void processOrder(String customerName, String coffeeType, double basePrice) {
        System.out.println("[Controller] Processing order for " + customerName + "...");

        // 1. Calculate final price including 12% VAT using Harry's class
        double finalPrice = taxCalculator.calculateTotalWithTax(basePrice);

        // 2. Format and print the customer receipt using Diane's class
        receiptPrinter.printReceipt(customerName, coffeeType, finalPrice);

        // 3. Save the transaction logs to the text file using Justine's class
        orderRepository.saveOrder(customerName, coffeeType, finalPrice);

        System.out.println("[Controller] Order successfully finalized.");
    }
}
