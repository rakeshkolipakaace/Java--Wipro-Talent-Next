package Collections.Maps;

import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

public class assignment3 {
    Properties states = new Properties();

    public void addStates(String stateName, String capital) {
        states.setProperty(stateName, capital);
    }

    public void listStates() {
        Set<Object> stateNames = states.keySet();
        Iterator<Object> iterator = stateNames.iterator();
        while (iterator.hasNext()) {
            String stateName = (String) iterator.next();
            String capital = states.getProperty(stateName);
            System.out.println("State: " + stateName + ", Capital: " + capital);
        }
    }

    public static void main(String[] args) {
        assignment3 obj = new assignment3();
        obj.addStates("Telangana", "Hyderabad");
        obj.addStates("Tamil Nadu", "Chennai");
        obj.addStates("Andhra Pradesh", "Visakhapatnam");

        obj.listStates();

    }
}
