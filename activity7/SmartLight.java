public class SmartLight extends SmartDevice {

    // attribute
    public int brightness;

    public SmartLight(String deviceName, boolean isOn) {
        super(deviceName, isOn);
    }

    public void displayStatus() {
        super.displayStatus(); // yung device eme
        System.out.println("Brightness: " + brightness);
    }

    // Only sets the brightness if the device is isOn.
    public int setBrightness(int level) {
        if (isOn) {
            brightness = level;
        } else {
            System.out.println("Cannot set brightness. " + deviceName + " is currently OFF.");
        }
        return brightness;
    }
}
