public class co2 {

    String name;
    double height;
    double weight;

    co2(String name, double height, double weight) {

        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    public double computeBMI() {
        return weight / (height * height);

    }

    public static void main(String[] args) {

        co2 p = new co2("Roy", 1.58, 75.0);
        System.out.println(p.computeBMI());

    }

}
