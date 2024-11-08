package pos.model;

import java.time.LocalDateTime;

public class Transaction {
    private Long transactionId;
    private Order order;
    private Payment payment;
    private Shipping shipping;
    private Double totalAmount;
    private LocalDateTime transactionDate;

    public Transaction(Long transactionId, Order order) {
        this.transactionId = transactionId;
        this.order = order;
        this.transactionDate = LocalDateTime.now();
        calculateTotal();
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Order getOrder() {
        return order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        if (payment.getAmount().compareTo(this.totalAmount) != 0) {
            throw new IllegalArgumentException("Payment amount does not match total amount");
        }
        this.payment = payment;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void calculateTotal() {
        this.totalAmount = order.getProducts().stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
