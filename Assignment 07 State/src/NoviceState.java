public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gained 10 experience points!");
        character.addExperience(10);
        if (character.getExperiencePoints() >= 50) {
            System.out.println("Congratulations! You have advanced to the Intermediate level.");
            character.setState(new IntermediateState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditation is not available at the Novice level.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at the Novice level.");
    }
}