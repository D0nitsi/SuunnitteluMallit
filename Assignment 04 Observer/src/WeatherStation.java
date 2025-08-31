import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WeatherStation implements Subject, Runnable {
    private final List<Observer> observers = new ArrayList<>();
    private double temperature;
    private final double minTemp = -10.0;
    private final double maxTemp = 40.0;
    private final Random random = new Random();
    private boolean running = true;

    public WeatherStation() {
        this.temperature = random.nextDouble() * (maxTemp - minTemp) + minTemp;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(random.nextInt(4000) + 1000); // Random delay between 1-5 seconds
                updateTemperature();
                notifyObservers();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void updateTemperature() {
        double change = random.nextDouble() * 2 - 1; // Random change between -1 and +1
        temperature = Math.max(minTemp, Math.min(maxTemp, temperature + change));
    }
}