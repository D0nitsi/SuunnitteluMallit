// SmartRemote.java
public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);
        if (command.equalsIgnoreCase("browse internet") && device instanceof SmartTV) {
            ((SmartTV) device).browseInternet();
        }
    }
}
