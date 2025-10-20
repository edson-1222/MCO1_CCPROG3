
public class Products {

    private String serialNo;
    private String name;
    private double price;
    private ProductType type;

    public Products(String name, double price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.serialNo = type.getPrefix() + String.format("%04d", type.getCounter());
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public ProductType getType() {
        return this.type;
    }

}
