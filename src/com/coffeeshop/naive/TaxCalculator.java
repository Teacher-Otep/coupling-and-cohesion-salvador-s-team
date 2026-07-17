package com.coffeeshop.naive;

/**
 * @author Andres
 * Responsibility: Business Logic / Pricing (Tax Calculations)
 */
public class TaxCalculator {

    // Hardcoded 12% tax rate as defined in the README/original code
    private static final double TAX_RATE = 0.12;

    public double calculateTotalWithTax(double basePrice) {
        System.out.println("[Tax Engine] Calculating 12% VAT...");
        double taxAmount = basePrice * TAX_RATE;
        return basePrice + taxAmount;
    }
}