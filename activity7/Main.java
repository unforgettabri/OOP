public class Main {
    public static void main(String[] args) {
        //1: Instantiate SmartLight
        SmartLight L1 = new SmartLight("Living Room Light");
        
        //2: Try to set brightness before turning on (should not change)
        L1.displayStatus(); //to show yung bfore
        System.out.println();
        L1.setBrightness(80);
        System.out.println();
        
        //3: Turn on, set brightness, and display status
        L1.togglePower();
        L1.setBrightness(80);
        System.out.println("Lights turned on and set to 80 brightness.");
        System.out.println();
        L1.displayStatus();
        System.out.println();
        
        //4: SmartThermostat
        System.out.println("Thermostat turned on and set to 32°C.");
        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat");
        thermostat.togglePower();
        thermostat.setTemperature(32);
        System.out.println();
        thermostat.displayStatus();
    }
}