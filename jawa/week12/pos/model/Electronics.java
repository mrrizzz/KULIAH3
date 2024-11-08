package pos.model;

public class Electronics extends Product {
    private String imeiId;
    private Integer warrantyPeriod; // in months

    public Electronics(Long productId, String name, Double price, Integer stock, 
                      String imeiId, Integer warrantyPeriod) {
        super(productId, name, price, stock);
        this.imeiId = imeiId;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getImeiId() {
        return imeiId;
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
