import java.util.Random;

public class CityMap extends Map {
    private static final Tile[] CITY_TILES = {
            new RoadTile(),
            new ForestTile(),
            new BuildingTile()
    };

    public CityMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return CITY_TILES[random.nextInt(CITY_TILES.length)];
    }
}