package pos.model;

import java.time.LocalDateTime;

public class Payment {
    private String paymentId;
    private String paymentMethod;
    private Double amount;
    private Boolean paid;
    private LocalDateTime paymentDate;

    public Payment(String paymentId, String paymentMethod, Double amount) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paid = false;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public Boolean isPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
        if (paid) {
            this.paymentDate = LocalDateTime.now();
        }
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
}
