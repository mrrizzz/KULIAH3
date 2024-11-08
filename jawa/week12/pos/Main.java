package pos;

import pos.model.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create an address
        Address address = new Address("Indonesia", "Jakarta", "Jalan Sudirman 123");

        // Create a customer
        Customer customer = new Customer(1L, "John Doe", address);

        // Create some products
        Electronics laptop = new Electronics(1L, "Laptop", 1000.0, 5, "IMEI123", 12);
        FnB snack = new FnB(2L, "Chips", 2.0, 100, 
                           LocalDateTime.now().plusMonths(6), 150);

        // Create an order
        Order order = new Order(1L, customer);
        order.addProduct(laptop);
        order.addProduct(snack);

        // Create a transaction
        Transaction transaction = new Transaction(1L, order);
        
        // Add payment
        Payment payment = new Payment("PAY123", "CREDIT_CARD", transaction.getTotalAmount());
        transaction.setPayment(payment);
        
        // Add shipping
        Shipping shipping = new Shipping("SHIP123", "EXPRESS");
        shipping.setTrackingNumber("TRK123456");
        shipping.setEstimatedDeliveryDate(LocalDateTime.now().plusDays(2));
        transaction.setShipping(shipping);

        // Process payment
        payment.setPaid(true);

        // Update shipping status
        shipping.setStatus(ShippingStatus.PROCESSING);

        // Print transaction details
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Customer: " + transaction.getOrder().getCustomer().getName());
        System.out.println("Total Amount: $" + transaction.getTotalAmount());
        System.out.println("Payment Status: " + (payment.isPaid() ? "Paid" : "Pending"));
        System.out.println("Shipping Status: " + shipping.getStatus());
    }
}
