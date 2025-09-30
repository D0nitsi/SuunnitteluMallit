public class Tile {
    private final int x, y; // extrinsic state
    private final TileType type; // intrinsic state

    public Tile(int x, int y, TileType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public TileType getType() { return type; }
}
