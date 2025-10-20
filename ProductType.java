
public class ProductType {

    private String name;
    private String prefix;
    private int counter;

    public ProductType(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
        this.counter = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void counterIncriment() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }
}
