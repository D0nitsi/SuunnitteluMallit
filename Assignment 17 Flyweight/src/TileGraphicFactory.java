import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private final Map<String, Image> graphics = new HashMap<>();

    public Image getGraphic(TileType type) {
        return graphics.computeIfAbsent(type.getName(), name -> {
            // Load or generate the image for this tile type
            // Example: return new Image("file:assets/" + name + ".png");
            // For demo, use a placeholder
            return new Image("file:assets/" + name + ".png");
        });
    }
}
