// Main.java
public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        director1.constructComputer();
        Computer gamingComputer = director1.getComputer();
        System.out.println("Gaming Computer:\n" + gamingComputer);

        System.out.println();

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.constructComputer();
        Computer officeComputer = director2.getComputer();
        System.out.println("Office Computer:\n" + officeComputer);
    }
}
