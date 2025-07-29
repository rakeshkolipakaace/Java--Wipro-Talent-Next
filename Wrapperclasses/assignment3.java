package Wrapperclasses;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary representation: " + binary);

        sc.close();
    }

}
