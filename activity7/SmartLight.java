public class SmartLight extends SmartDevice {

    // attribute
    public int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
        this.brightness = 0;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); //device eme
        System.out.println("Brightness: " + brightness);
    }

    // Only sets the brightness if the device is isOn.
    public void setBrightness(int level) {
        if (isOn()) {
            brightness = level;
        } else {
            System.out.println("Cannot set brightness. " + getDeviceName() + " is currently OFF.");
        }
    }
}
