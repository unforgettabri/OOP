public class SmartThermostat extends SmartDevice {

    // attribute
    public double temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
        this.temperature = 0.0;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperature  + "°C");
    }

    // Prints a warning if the temperature is set above 30°C.
    public void setTemperature(double temp) {
        this.temperature = temp;
        if (temp > 30) {
            System.out.println("WARNING! TOO HOT! rraaAWr");
        }
    }
}