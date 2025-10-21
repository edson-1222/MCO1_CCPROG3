import java.util.ArrayList;

/**
 * Abstract base class for shopping equipment (Basket and Cart).
 */
public abstract class Equipment {
    protected String type;
    protected int maxCapacity;
    protected ArrayList<Products> products;

    /**
     * Constructor for Equipment
     * @param type The equipment type name
     * @param maxCapacity Maximum number of products
     */
    public Equipment(String type, int maxCapacity) {
        this.type = type;
        this.maxCapacity = maxCapacity;
        this.products = new ArrayList<>();
    }

    public String getType() {
        return this.type;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public ArrayList<Products> getProducts() {
        return this.products;
    }

    public int getCurrentCapacity() {
        return this.products.size();
    }

    /**
     * Adds a product to the equipment
     * @param product The product to add
     * @return true if successfully added, false if full
     */
    public boolean addProduct(Products product) {
        if (products.size() >= maxCapacity) {
            System.out.println("Equipment is full! Cannot add more products.");
            return false;
        }
        products.add(product);
        return true;
    }

    /**
     * Removes a product from the equipment
     * @param product The product to remove
     * @return true if successfully removed, false if not found
     */
    public boolean removeProduct(Products product) {
        return products.remove(product);
    }

    /**
     * Clears all products from the equipment
     */
    public void clear() {
        products.clear();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public boolean isFull() {
        return products.size() >= maxCapacity;
    }
}
