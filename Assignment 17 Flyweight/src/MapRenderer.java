import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MapRenderer {
    private final TileGraphicFactory graphicFactory;

    public MapRenderer(TileGraphicFactory factory) {
        this.graphicFactory = factory;
    }

    public void render(GameMap map, GraphicsContext gc, int tileSize) {
        for (Tile tile : map.getTiles()) {
            Image img = graphicFactory.getGraphic(tile.getType());
            gc.drawImage(img, tile.getX() * tileSize, tile.getY() * tileSize, tileSize, tileSize);
        }
    }
}
