
public class Display {

    private String name;
    private DisplayType displayType;
    private Products[][] items;

    public Display(String name, DisplayType displayType) {
        this.name = name;
        this.displayType = displayType;
        this.items = new Products[displayType.getTier()][displayType.getSlot()];
    }

    public String getName() {
        return this.name;
    }

    public DisplayType getType() {
        return this.displayType;
    }

    public Products[][] getItems() {
        return this.items;
    }

    public boolean itemInsert(Products product, int slot, int tier) { // When item is inserted in slot.
        if (!displayType.getProductTypeAllowed().contains(product.getType())) { // Checks if the display type allows the product type of the product.
            System.out.println("Item '" + product.getName() + "' with product type '" + product.getType().getName() + "' is not allowed for display type: " + displayType.getName() + ".");
            return false;
        }

        if (slot <= 0 || slot > displayType.getSlot() || tier <= 0 || tier > displayType.getTier()) { // Checks is within range.
            System.out.println("Out of range [" + tier + "] [" + slot + "]: item '" + product.getName() + ".");
            return false;
        }

        tier--;
        slot--;

        if (items[tier][slot] != null) { // Checks if array is occupied.
            System.out.println("Slot [" + tier + "][" + slot + "] is already occupied by: " + items[tier][slot]);
            return false;
        }

        items[tier][slot] = product; // No message for now because of MOCK DESIGN

        return true;
    }

    public Products itemRemove(int slot, int tier) { // When shopper gets item or removed by employee.
        if (slot <= 0 || slot > displayType.getSlot() || tier <= 0 || tier > displayType.getTier()) { // Checks is within range.
            System.out.println("Out of range.");
            return null;
        }

        if (items[tier - 1][slot - 1] == null) {
            System.out.println("Slot [" + slot + "][" + tier + "] is already empty.");
            return null;
        }

        Products itemToBeRemoved = items[tier - 1][slot - 1];
        items[tier - 1][slot - 1] = null;

        return itemToBeRemoved;
    }

}
