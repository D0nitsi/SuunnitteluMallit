public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gained 20 experience points!");
        character.addExperience(20);
        if (character.getExperiencePoints() >= 200) {
            System.out.println("Congratulations! You have advanced to the Master level.");
            character.setState(new MasterState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... Gained 25 health points!");
        character.addHealth(25);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting... Lost 10 health points but gained 30 experience points!");
        character.reduceHealth(10);
        character.addExperience(30);
        if (character.getExperiencePoints() >= 200) {
            System.out.println("Congratulations! You have advanced to the Master level.");
            character.setState(new MasterState());
        }
    }
}