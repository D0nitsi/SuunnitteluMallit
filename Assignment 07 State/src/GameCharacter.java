public class GameCharacter {
    private String name;
    private int experiencePoints;
    private int healthPoints;
    private State currentState;

    public GameCharacter(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        this.currentState = new NoviceState(); // Start as a novice
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void addExperience(int points) {
        this.experiencePoints += points;
    }

    public void addHealth(int points) {
        this.healthPoints += points;
    }

    public void reduceHealth(int points) {
        this.healthPoints -= points;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public void train() {
        currentState.train(this);
    }

    public void meditate() {
        currentState.meditate(this);
    }

    public void fight() {
        currentState.fight(this);
    }

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Health Points: " + healthPoints);
        System.out.println("Current Level: " + currentState.getClass().getSimpleName().replace("State", ""));
    }
}