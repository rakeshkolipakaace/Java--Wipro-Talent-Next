package Abstraction.packages.automobiles.twowheeler;


import Abstraction.packages.automobiles.vehicle;
public class Hero extends vehicle {

    public String getModelName(){
        return "Hero";
    }

   public String getRegistrationNumber(){
        return "123456789";
        }

    public String getOwnerName(){
       return "Roy";
    }

    public String getSpeed(){
        return "Speed: 100";
    }
    
    public String radio(){
       return "Radio: 100";
    }
}
