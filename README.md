# Module 1: Introduction to Software Design Principles & Code Smells

Welcome to the initial codebase for **CC113: Integrative Programming Technologies 2**. This repository serves as our ongoing practical case study: **The Coffee Shop Ordering System**.

## ☕ Current State: The Naive Implementation
Right now, the system consists of a single monolithic class (`OrderProcessor.java`) that handles an order from start to finish. 

### 🚨 Architectural Problems (Code Smells)
While this program compiles and runs perfectly, it suffers from **Low Cohesion** and **Tight Coupling**. It completely violates the **Single Responsibility Principle (SRP)** because it changes for three completely separate business reasons:
1. **Tax/Pricing Rules:** Hardcoded 12% calculations.
2. **User Interface / Presentation:** Directly formatting a text-based console receipt.
3. **Data Persistence:** Hardcoded local text file logging operations.

## 🛠️ Student Lab Objectives
Clone this branch and look closely at `OrderProcessor.java`. Prepare to refactor this code in our next session by separating these concerns into distinct, highly cohesive classes:
* An `Order` model to hold state.
* A `TaxCalculator` or `PricingService` for business logic.
* A `ReceiptPrinter` for formatting outputs.
* An `OrderRepository` to handle file/database logging.

---
*Course: CC113 - Integrative Programming Technologies 2* *Instructor: Joseph Christian Padin*# NaiveCoffeeShop
