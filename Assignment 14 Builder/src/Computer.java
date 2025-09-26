// Computer.java
public class Computer {
    private String processor;
    private int ramSize;
    private String hardDrive;
    private String graphicsCard;
    private String operatingSystem;

    // Getters and setters
    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public String getHardDrive() { return hardDrive; }
    public void setHardDrive(String hardDrive) { this.hardDrive = hardDrive; }

    public String getGraphicsCard() { return graphicsCard; }
    public void setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; }

    public String getOperatingSystem() { return operatingSystem; }
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "Processor: " + processor + "\n" +
                "RAM: " + ramSize + " GB\n" +
                "Hard Drive: " + hardDrive + "\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Operating System: " + operatingSystem;
    }
}
