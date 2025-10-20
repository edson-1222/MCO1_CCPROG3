
import java.util.ArrayList;

public class DisplayType {

    private String name;
    private ArrayList<ProductType> productTypeAllowed;
    private int slot;
    private int tier;

    public DisplayType(String name, ArrayList<ProductType> productTypeAllowed, int slot, int tier) {
        this.name = name;
        this.productTypeAllowed = productTypeAllowed;
        this.slot = slot;
        this.tier = tier;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ProductType> getProductTypeAllowed() {
        return this.productTypeAllowed;
    }

    public int getSlot() {
        return this.slot;
    }

    public int getTier() {
        return this.tier;
    }

    public void addProductType(ProductType type) {
        this.productTypeAllowed.add(type);
    }

    public void removeProductType(ProductType type) {
        this.productTypeAllowed.remove(type);
    }
}
