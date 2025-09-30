import java.util.List;

public class GameMap {
    private final List<Tile> tiles;
    private final int width, height;

    public GameMap(List<Tile> tiles, int width, int height) {
        this.tiles = tiles;
        this.width = width;
        this.height = height;
    }

    public List<Tile> getTiles() { return tiles; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
