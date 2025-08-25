public abstract class Map {
    protected Tile[][] tiles;
    protected int rows;
    protected int cols;

    public Map(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.tiles = new Tile[rows][cols];
        generateMap();
    }

    // Abstract factory method
    protected abstract Tile createTile();

    // Generate the map by filling it with random tiles
    private void generateMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    // Display the map as a matrix of characters
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}