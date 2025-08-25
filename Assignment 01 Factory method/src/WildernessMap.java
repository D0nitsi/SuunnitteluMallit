import java.util.Random;

public class WildernessMap extends Map {
    private static final Tile[] WILDERNESS_TILES = {
            new SwampTile(),
            new WaterTile(),
            new ForestTile()
    };

    public WildernessMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return WILDERNESS_TILES[random.nextInt(WILDERNESS_TILES.length)];
    }
}