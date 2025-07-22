public class co1 {

    public static int method(int n1, int n2) {

        return (int) Math.pow(n1, n2);

    }

    public static double powerDouble(double n1, int n2) {

        return Math.pow(n1, n2);

    }

    public static void main(String[] args) {

        co1 c = new co1();

        System.out.println(c.method(10, 20));
        System.out.println(c.powerDouble(10.2, 20));

    }

}
