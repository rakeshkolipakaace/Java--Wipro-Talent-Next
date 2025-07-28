package Interfaces.live;

import Interfaces.Veena.veena;
import Interfaces.wind.saxophone;
import Interfaces.playable;

public class Text {

    public static void main(String[] args) {

        veena v = new veena();
        saxophone s = new saxophone();

        v.play();
        s.play();

        playable p1 = v;
        playable p2 = s;

        p1.play();
        p2.play();

    }

}
