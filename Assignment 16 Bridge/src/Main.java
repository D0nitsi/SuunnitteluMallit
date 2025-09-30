// Main.java
public class Main {
    public static void main(String[] args) {
        Device smartTV = new SmartTV();
        Remote smartRemote = new SmartRemote(smartTV);

        smartRemote.power();
        smartRemote.volumeUp();
        ((SmartRemote) smartRemote).voiceControl("browse internet");
        smartTV.printStatus();
    }
}
