import java.util.ArrayList;

/**
 * Represents a floor in the supermarket with a 22x22 grid.
 */
public class Floor {
    private String floorName;
    private Tile[][] grid;
    private static final int GRID_SIZE = 22;

    /**
     * Constructor for Floor
     * @param floorName The name of the floor (e.g., "GF" or "2F")
     */
    public Floor(String floorName) {
        this.floorName = floorName;
        this.grid = new Tile[GRID_SIZE][GRID_SIZE];
        initializeEmptyFloor();
    }

    /**
     * Initializes all tiles as empty
     */
    private void initializeEmptyFloor() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = new Tile(TileType.EMPTY);
            }
        }
    }

    public String getFloorName() {
        return this.floorName;
    }

    public Tile[][] getGrid() {
        return this.grid;
    }

    /**
     * Gets the tile at specified position
     * @param row The row coordinate
     * @param col The column coordinate
     * @return The tile at that position, or null if out of bounds
     */
    public Tile getTile(int row, int col) {
        if (isValidPosition(row, col)) {
            return grid[row][col];
        }
        return null;
    }

    /**
     * Sets a tile at specified position
     * @param row The row coordinate
     * @param col The column coordinate
     * @param tile The tile to set
     */
    public void setTile(int row, int col, Tile tile) {
        if (isValidPosition(row, col)) {
            grid[row][col] = tile;
        }
    }

    /**
     * Checks if position is within grid bounds
     * @param row The row coordinate
     * @param col The column coordinate
     * @return true if position is valid
     */
    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < GRID_SIZE && col >= 0 && col < GRID_SIZE;
    }

    /**
     * Checks if a position is passable
     * @param row The row coordinate
     * @param col The column coordinate
     * @return true if the tile is passable
     */
    public boolean isPassable(int row, int col) {
        if (!isValidPosition(row, col)) {
            return false;
        }
        return grid[row][col].isPassable();
    }

    /**
     * Finds all displays containing a specific product
     * @param productName The product name to search for
     * @param allProducts List of all products in the supermarket
     * @return List of displays containing the product
     */
    public ArrayList<Display> findProductDisplays(String productName, ArrayList<Products> allProducts) {
        ArrayList<Display> foundDisplays = new ArrayList<>();
        
        // Find the product first
        Products targetProduct = null;
        for (Products p : allProducts) {
            if (p.getName().equalsIgnoreCase(productName)) {
                targetProduct = p;
                break;
            }
        }
        
        if (targetProduct == null) {
            return foundDisplays;
        }
        
        // Search all displays on this floor
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (grid[i][j].isDisplay() && grid[i][j].getDisplay() != null) {
                    Display display = grid[i][j].getDisplay();
                    if (display.containsProduct(targetProduct)) {
                        if (!foundDisplays.contains(display)) {
                            foundDisplays.add(display);
                        }
                    }
                }
            }
        }
        
        return foundDisplays;
    }
}
