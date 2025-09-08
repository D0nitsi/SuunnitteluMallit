public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gained 15 experience points!");
        character.addExperience(15);
        if (character.getExperiencePoints() >= 100) {
            System.out.println("Congratulations! You have advanced to the Expert level.");
            character.setState(new ExpertState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... Gained 20 health points!");
        character.addHealth(20);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at the Intermediate level.");
    }
}