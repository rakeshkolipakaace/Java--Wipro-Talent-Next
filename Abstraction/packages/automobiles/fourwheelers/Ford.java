package Abstraction.packages.automobiles.fourwheelers;

import Abstraction.packages.automobiles.vehicle;
public class Ford extends vehicle{

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "123456789";
    }

    public String getOwnerName() {
        return "Ford";
    }

    public String getSpeed() {
        return "Speed: 100";
    }

    public String gps() {
        return "GPS: 100";
    }

    public String tempControl(){
        return "Temperature Control: 101";
    }
    
}
