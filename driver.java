
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        // INITIALIZATION OF DRIVER 
        Scanner scanner = new Scanner(System.in);

        // Note 5: Since it is a mock, I should combine just the initializations all in one method.
        // Note 6: Previous code deleted, however notes are in the bottom.
        // INITIALIZATION OF MOCK SUPERMARKET - Ask sir if this is a good way to store memory.
        // Note 2: Dynamic List in case store wants to add/remove more Products and Product Types and Display Types
        ArrayList<ProductType> productTypes = new ArrayList<ProductType>();
        ArrayList<Products> products = new ArrayList<Products>();
        ArrayList<DisplayType> displayTypes = new ArrayList<DisplayType>();
        ArrayList<Display> displays = new ArrayList<Display>();

        initializeMockSuperMarket(productTypes, products, displayTypes, displays);

        // SHOPPER CREATION
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        Shopper shopper = new Shopper(name, age);

        // MAIN MENU
        System.out.println();
        System.out.println("Welcome, " + shopper.getName() + "!");
        System.out.println("You are: " + shopper.getAge() + " years old.");
        System.out.println();

        if (shopper.getIsMinor()) {
            System.out.println("Shoppers under 18 are not allowed to buy ALCOHOLIC beverages and CLEANING AGENTS.");
            System.out.println();
        } else if (shopper.getDiscounted()) {
            System.out.println("Shoppers over age 60 are eligible for Senior Citizen's Discount! FOOD products: 20% off, BEVERAGE products: 10% off.");
            System.out.println();
        }
        System.out.println("Please enjoy your stay!");

        scanner.close();
    }

    // Initializer of Mock Products
    private static void initializeMockSuperMarket(ArrayList<ProductType> productTypes, ArrayList<Products> products, ArrayList<DisplayType> displayTypes, ArrayList<Display> displays) {
        // INITIALIZATION OF PRODUCT TYPES
        ProductType fruitType = new ProductType("Fruit", "FRU");
        ProductType beefType = new ProductType("Beef", "BEF");
        ProductType seaFoodType = new ProductType("Sea food", "SEA");
        ProductType chickenType = new ProductType("Chicken", "CHK");
        ProductType cerealType = new ProductType("Cereal", "CER");
        ProductType noodleType = new ProductType("Noodle", "NDL");
        ProductType snackType = new ProductType("Snacks", "SNK");
        ProductType cannedType = new ProductType("Canned Goods", "CAN");
        ProductType condimentType = new ProductType("Condiment", "CON");
        ProductType softDrinkType = new ProductType("Soft Drink", "SFT");
        ProductType juiceType = new ProductType("Juice", "JUC");
        ProductType alcoholType = new ProductType("Alcohol", "ALC");

        productTypes.addAll(List.of(fruitType, beefType, seaFoodType, chickenType, cerealType, noodleType, snackType, cannedType, condimentType, softDrinkType, juiceType, alcoholType));

        // INITIALIZATION OF PRODUCTS
        // Fruit Type
        Products fruit1 = new Products("Watermelon", 10.00, fruitType);
        Products fruit2 = new Products("Icemelon", 12.00, fruitType);
        Products fruit3 = new Products("Watervapormelon", 14.00, fruitType);
        products.addAll(List.of(fruit1, fruit2, fruit3)); // Adds to main driver memory.

        // Beef Type
        Products beef1 = new Products("Rib eye", 15.0, beefType);
        Products beef2 = new Products("Rib ears", 2.0, beefType);
        Products beef3 = new Products("Rib nose", 1.0, beefType);
        products.addAll(List.of(beef1, beef2, beef3));

        // Seafood
        Products seafood1 = new Products("Shrimp", 0.5, seaFoodType);
        Products seafood2 = new Products("Clam", 1.0, seaFoodType);
        Products seafood3 = new Products("Megalodon", 300000, seaFoodType);
        products.addAll(List.of(seafood1, seafood2, seafood3));

        // Chicken
        Products chicken1 = new Products("Chicken Beak", 0.1, chickenType);
        Products chicken2 = new Products("Chicken Comb", 0.2, chickenType);
        Products chicken3 = new Products("Chicken Feather", 0.1, chickenType);
        products.addAll(List.of(chicken1, chicken2, chicken3));

        // Cereal
        Products cereal1 = new Products("Feastables", 10.00, cerealType);
        Products cereal2 = new Products("Coco-soggy", 8.00, cerealType);
        Products cereal3 = new Products("Bran", 8.00, cerealType);
        products.addAll(List.of(cereal1, cereal2, cereal3));

        // Noodle
        Products noodle1 = new Products("Pancit-canton", 1, noodleType);
        Products noodle2 = new Products("Pancit-malabon", 1, noodleType);
        Products noodle3 = new Products("Pancit-palabok", 1, noodleType);
        products.addAll(List.of(noodle1, noodle2, noodle3));

        // Snack
        Products snack1 = new Products("Lunchable", 12, snackType);
        Products snack2 = new Products("Scooby-snacks", 4, snackType);
        Products snack3 = new Products("Homer's Jimmies", 6, snackType);
        products.addAll(List.of(snack1, snack2, snack3));

        // Canned Goods
        Products canned1 = new Products("Beans", 3, cannedType);
        Products canned2 = new Products("More Beans", 4, cannedType);
        Products canned3 = new Products("Most Beans", 10000, cannedType);
        products.addAll(List.of(canned1, canned2, canned3));

        // Condiments
        Products condiment1 = new Products("Ketchup", 5, condimentType);
        Products condiment2 = new Products("Mustard", 5, condimentType);
        Products condiment3 = new Products("Mayonnaise", 5, condimentType);
        products.addAll(List.of(condiment1, condiment2, condiment3));

        // Soft Drinks
        Products softdrink1 = new Products("Monster (The drink)", 1, softDrinkType);
        Products softdrink2 = new Products("Prime Energy", 2, softDrinkType);
        Products softdrink3 = new Products("Bang Energy", 3, softDrinkType);
        products.addAll(List.of(softdrink1, softdrink2, softdrink3));

        // Alcohol
        Products alcohol1 = new Products("Cuervo", 10, alcoholType);
        Products alcohol2 = new Products("Smirnov", 2, alcoholType);
        Products alcohol3 = new Products("Ginebra", 2, alcoholType);
        products.addAll(List.of(alcohol1, alcohol2, alcohol3));

        // INITIALIZATION OF DISPLAY TYPE
        DisplayType tableType = new DisplayType("Table", new ArrayList<>(List.of(fruitType)), 4, 1); //Add vegetables, bread, and eggs
        DisplayType refrigeratorType = new DisplayType("Refrigerator", new ArrayList<>(List.of()), 3, 3); // Add milk, Frozen Food, and Cheese
        DisplayType chilledCounterType = new DisplayType("Chilled Counter", new ArrayList<>(List.of(chickenType, beefType, seaFoodType)), 3, 1);
        DisplayType shelfType = new DisplayType("Shelf", new ArrayList<>(List.of(cerealType, noodleType, snackType, cannedType, condimentType, juiceType, softDrinkType)), 4, 2);
        displayTypes.addAll(List.of(tableType, refrigeratorType, chilledCounterType, shelfType));

        // INITIALIZATION OF DISPLAYS
        Display display1 = new Display("Table1", tableType);

        Display display2 = new Display("Refrigerator1", refrigeratorType);

        Display display3 = new Display("ChilledCounter1", chilledCounterType);
        Display display4 = new Display("ChilledCounter2", chilledCounterType);
        Display display5 = new Display("ChilledCounter3", chilledCounterType);

        Display display6 = new Display("Shelf1", shelfType);
        Display display7 = new Display("Shelf2", shelfType);

        displays.addAll(List.of(display1, display2, display3, display4, display5, display6, display7));

        // PUT MOCK ITEMS IN DISPLAYS
        display1.itemInsert(fruit1, 1, 1);
        display1.itemInsert(fruit2, 2, 1);
        display1.itemInsert(fruit2, 3, 1);
        //  Expected: Table Contains: [Watermelon] [Icemelon] [Watervapormelon] [ ]

        display3.itemInsert(beef1, 1, 1);
        display3.itemInsert(beef1, 2, 1);
        display3.itemInsert(beef3, 3, 1);
        //  Expected: Chilled Refrigerator Contains: [Rib Eye] [Rib Ears]
        //                                           [Rib nose]

        display4.itemInsert(chicken1, 1, 1);
        display4.itemInsert(chicken2, 2, 1);
        display4.itemInsert(chicken3, 3, 1);
        //  Expected: Chilled Refrigerator Contains: [Chicken Beak] [Chicken Comb]
        //                                           [Chicken Feather]

        display5.itemInsert(seafood1, 1, 1);
        display5.itemInsert(seafood2, 2, 1);
        display5.itemInsert(seafood3, 3, 1);
        //  Expected: Chilled Refrigerator Contains: [Shrimp] [Clam]
        //                                           [Megalodon]

        display6.itemInsert(cereal1, 1, 1);
        display6.itemInsert(cereal2, 2, 1);
        display6.itemInsert(cereal3, 3, 1);
        display6.itemInsert(noodle1, 4, 1);
        display6.itemInsert(noodle2, 1, 2);
        display6.itemInsert(noodle3, 2, 2);
        display6.itemInsert(snack1, 3, 2);
        display6.itemInsert(snack2, 4, 2);
        //  Expected: Table Contains: [Feastables] [Coco-soggy] [Bran] [Pancit-canton]
        //                            [Pancit-malabon] [Pancit-palabok] [Lunchable] [Scooby-snacks]

        display7.itemInsert(snack3, 1, 1);
        display7.itemInsert(canned1, 2, 1);
        display7.itemInsert(canned2, 3, 1);
        display7.itemInsert(canned3, 4, 1);
        display7.itemInsert(condiment1, 1, 2);
        display7.itemInsert(condiment2, 2, 2);
        display7.itemInsert(condiment3, 3, 2);
        display7.itemInsert(softdrink1, 4, 2);
    }

    // INITIALIZATION OF DISPLAYS - Other notes are found in different Model Classes
    // Note 1: Ask Sir Alex if this is a smart way to instantiate the Product Types
    // My reasoning: I wanted to create a clear instantiation of all the products, displays, display types, and product types.
    // Note 3: A little birdie told me I should not store my Array Lists on the main Driver...well, sir's Library Example he stored the Library Books in main, so...
    // Note 4: BUT THIS IS A SIMULATION, technically, in OOP-enterprise level, the "manager" is the one to put objects in via "add" methods, but this is just a mock.
    // Note 7: ALRIGHT, creating a higher tier class to keep all memories. 
}
