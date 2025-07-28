package Interface1;

import Interface1.lambdaexpression.Test;

public class Main1 {

    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int res1 = t1.myfunction(2, 3, 4);
        int res2 = t2.myfunction(2, 3, 4);

        System.out.println("sum" + " " + res1);
        System.out.println("mul" + " " + res2);

    }

}
