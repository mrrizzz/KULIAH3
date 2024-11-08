package pos.model;

public class Customer {
    private Long customerId;
    private String name;
    private Address address;

    public Customer(Long customerId, String name, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
