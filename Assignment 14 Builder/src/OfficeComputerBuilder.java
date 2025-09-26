// OfficeComputerBuilder.java
public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    public void buildProcessor() { computer.setProcessor("Intel Core i5"); }
    public void buildRAM() { computer.setRamSize(16); }
    public void buildHardDrive() { computer.setHardDrive("512 GB SSD"); }
    public void buildGraphicsCard() { computer.setGraphicsCard("Integrated Graphics"); }
    public void buildOperatingSystem() { computer.setOperatingSystem("Windows 11 Home"); }
    public Computer getComputer() { return computer; }
}
