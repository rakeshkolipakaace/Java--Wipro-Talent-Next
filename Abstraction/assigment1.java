package Abstraction;

import java.util.Random;

abstract class Compartment {
    abstract String notice();
}

class FirstClass extends Compartment {
    String notice() {
        return "First Class";
    }
}

class Ladies extends Compartment {
    String notice() {
        return "Ladies Class";
    }
}

class General extends Compartment {
    String notice() {
        return "General Class";
    }
}

class Luggage extends Compartment {
    String notice() {
        return "Luggage";
    }
}

public class assigment1 {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < c.length; i++) {
            int random = r.nextInt(4) + 1;
            switch (random) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("Compartment " + (i + 1) + " is: " + c[i].notice());
        }
    }
}
