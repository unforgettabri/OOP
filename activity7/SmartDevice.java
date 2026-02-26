public class SmartDevice {

    // attributes
    private String deviceName;
    private boolean isOn;

    // getters
    public String getDeviceName() {
        return deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    // setters
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    // Switches the device from on to off, or off to on.
    public void togglePower() {
        setOn(!isOn());
    }

    // Prints the device name and its current power state.
    public void displayStatus() {
        if (isOn()) {
            System.out.println(getDeviceName() + " is currently ON.");
        } else {
            System.out.println(getDeviceName() + " is currently OFF.");
        }
    }
}