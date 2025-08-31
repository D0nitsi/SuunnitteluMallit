public class WeatherObserver implements Observer {
    private final String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.printf("Observer %s: Current temperature is %.2f°C%n", name, temperature);
    }
}