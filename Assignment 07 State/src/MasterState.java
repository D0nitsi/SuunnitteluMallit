public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("You have reached the Master level. No further training is required.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("You have reached the Master level. No further meditation is required.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("You have reached the Master level. No further fighting is required.");
    }
}