public class Inheritance {

    public void eat() {

        System.out.println("Animal is eating");

    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Inheritance {

    public void eat() {
        System.out.println("Bird is eating");
    }

    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Main {
    public static void main(String[] args) {
        Inheritance i = new Inheritance();

        i.eat();

        i.sleep();

        Bird b = new Bird();

        b.eat();

        b.sleep();

        b.fly();
    }
}
