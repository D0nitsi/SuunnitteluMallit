public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        // Create and display a CityMap
        Map cityMap = game.createMap("city", 5, 5);
        System.out.println("City Map:");
        cityMap.display();

        // Create and display a WildernessMap
        Map wildernessMap = game.createMap("wilderness", 5, 5);
        System.out.println("\nWilderness Map:");
        wildernessMap.display();
    }

    public Map createMap(String type, int rows, int cols) {
        if ("city".equalsIgnoreCase(type)) {
            return new CityMap(rows, cols);
        } else if ("wilderness".equalsIgnoreCase(type)) {
            return new WildernessMap(rows, cols);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}