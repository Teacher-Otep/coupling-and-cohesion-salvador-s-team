package com.coffeeshop.naive;

public class ReceiptPrinter {
    
    // This method only handles displaying the receipt. 
    // It doesn't calculate tax or write to files—highly cohesive!
    public void printReceipt(String customerName, String coffeeType, double finalPrice) {
        System.out.println("\n==========================================");
        System.out.println("            COFFEE SEED CAFE             ");
        System.out.println("==========================================");
        System.out.println(" Customer Name : " + customerName);
        System.out.println(" Item Ordered  : " + coffeeType);
        System.out.println("------------------------------------------");
        System.out.printf(" Total Amount  : PHP %.2f (incl. 12%% VAT)\n", finalPrice);
        System.out.println("==========================================");
        System.out.println("       Thank you! Please come again!      ");
        System.out.println("==========================================\n");
    }
}
