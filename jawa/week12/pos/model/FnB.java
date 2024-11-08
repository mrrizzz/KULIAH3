package pos.model;

import java.time.LocalDateTime;

public class FnB extends Product {
    private LocalDateTime expiryDate;
    private Integer calories;

    public FnB(Long productId, String name, Double price, Integer stock, 
               LocalDateTime expiryDate, Integer calories) {
        super(productId, name, price, stock);
        this.expiryDate = expiryDate;
        this.calories = calories;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public Integer getCalories() {
        return calories;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expiryDate);
    }
}
