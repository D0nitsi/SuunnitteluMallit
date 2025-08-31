public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Thread stationThread = new Thread(weatherStation);

        WeatherObserver observer1 = new WeatherObserver("Alice");
        WeatherObserver observer2 = new WeatherObserver("Bob");
        WeatherObserver observer3 = new WeatherObserver("Charlie");

        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);
        weatherStation.registerObserver(observer3);

        stationThread.start();

        try {
            Thread.sleep(15000); // Let the simulation run for 15 seconds
            System.out.println("Removing observer Bob...");
            weatherStation.removeObserver(observer2);

            Thread.sleep(10000); // Let the simulation run for another 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            weatherStation.stop();
        }
    }
}