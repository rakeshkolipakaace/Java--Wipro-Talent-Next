package Abstraction.packages;

import Abstraction.packages.automobiles.twowheeler.Hero;
import Abstraction.packages.automobiles.twowheeler.Honda;
import Abstraction.packages.automobiles.fourwheelers.Ford;
import Abstraction.packages.automobiles.fourwheelers.Logan;

public class vechileTest {

    public static void main(String[] args) {
        Hero h = new Hero();
        Honda hh = new Honda();
        Ford ford = new Ford();
        Logan logan = new Logan();

        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        System.out.println(h.radio());
        System.out.println(hh.getModelName());
        System.out.println(hh.getRegistrationNumber());
        System.out.println(hh.getOwnerName());
        System.out.println(hh.getSpeed());
        hh.cdplayer();

        System.out.println("Logan Details:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.getSpeed());
        logan.gps();

        System.out.println();

        System.out.println("Ford Details:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.getSpeed());
        ford.tempControl();

    }

}
