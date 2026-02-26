public class SmartThermostat extends SmartDevice {

    // attribute
    public double temperature;

    public SmartThermostat(String deviceName, boolean isOn) {
        super(deviceName, isOn);
    }

    public void displayStatus() {
        super.displayStatus(); // yung device eme
        System.out.println("Temperature: " + temperature);
    }

    // Prints a warning if the temperature is set above 30°C.
    public void setTemperature(double temp) {
        if (isOn) {
            if (temperature > 30) {
                System.out.println("WARNING! TOO HOT! rraaAWr");
            }
        } else {
            System.out.println("Cannot set brightness. " + deviceName + " is currently OFF.");
        }
    }
}