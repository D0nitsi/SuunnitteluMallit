public class Main {
    public static void main(String[] args) {
        UIFactory factory;

        // Choose style A
        factory = new AFactory();
        Button buttonA = factory.createButton("Click Me");
        TextField textFieldA = factory.createTextField("Enter Text");
        Checkbox checkboxA = factory.createCheckbox("Check Me");

        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        // Change text dynamically
        buttonA.setText("Updated Button");
        buttonA.display();

        // Choose style B
        factory = new BFactory();
        Button buttonB = factory.createButton("Press Me");
        TextField textFieldB = factory.createTextField("Type Here");
        Checkbox checkboxB = factory.createCheckbox("Select Me");

        buttonB.display();
        textFieldB.display();
        checkboxB.display();
    }
}