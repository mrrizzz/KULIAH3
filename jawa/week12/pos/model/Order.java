package pos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private Long orderId;
    private Customer customer;
    private List<Product> products;
    private LocalDateTime orderDate;

    public Order(Long orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderDate = LocalDateTime.now();
    }

    public Long getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
