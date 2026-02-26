public class Main {
    public static void main(String[] args) {
        //1: Instantiate SmartLight
        SmartLight L1 = new SmartLight("Living Room Light");
        
        //2: Try to set brightness before turning on (should not change)
        L1.setBrightness(80);
        
        //3: Turn on, set brightness, and display status
        L1.togglePower();
        L1.setBrightness(80);
        L1.displayStatus();
        
        //4: SmartThermostat
        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat");
        thermostat.togglePower();
        thermostat.setTemperature(32);
        thermostat.displayStatus();
    }
}