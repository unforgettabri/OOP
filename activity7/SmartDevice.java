public class SmartDevice {

    // attributes
    public String deviceName;
    boolean isOn;

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

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    // Switches the device from on to off, or off to on.
    public void togglePower() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }

    // Prints the device name and its current power state.
    public void displayStatus() {
        if (isOn) {
            System.out.println(deviceName + " is currently ON.");
        } else {
            System.out.println(deviceName + " is currently OFF.");
        }
    }
}