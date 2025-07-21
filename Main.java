class Item {
    int m;

    Item(int n) {
        m = n;
    }

    Item() {}

    void display() {
        System.out.println(m);
    }
}

public class Main {
    public static void main(String args[]) {
        Item i = new Item(10);
        i.display();
        Item j = new Item();
        j.display();
    }
}
