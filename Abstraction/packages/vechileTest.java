package Abstraction.packages;

import Abstraction.packages.automobiles.twowheeler.Hero;
import Abstraction.packages.automobiles.twowheeler.Honda;

public class vechileTest {

    public static void main(String[] args) {
        Hero h = new Hero();
        Honda hh = new Honda();
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

    }

}
