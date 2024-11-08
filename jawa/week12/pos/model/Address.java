package pos.model;

public class Address {
    private String country;
    private String province;
    private String street;

    public Address(String country, String province, String street) {
        this.country = country;
        this.province = province;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street + ", " + province + ", " + country;
    }
}
