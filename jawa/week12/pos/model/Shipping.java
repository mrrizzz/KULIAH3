package pos.model;

import java.time.LocalDateTime;

public class Shipping {
    private String shippingId;
    private String shippingMethod;
    private ShippingStatus status;
    private String trackingNumber;
    private LocalDateTime estimatedDeliveryDate;

    public Shipping(String shippingId, String shippingMethod) {
        this.shippingId = shippingId;
        this.shippingMethod = shippingMethod;
        this.status = ShippingStatus.PENDING;
    }

    public String getShippingId() {
        return shippingId;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public ShippingStatus getStatus() {
        return status;
    }

    public void setStatus(ShippingStatus status) {
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDateTime getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
}
