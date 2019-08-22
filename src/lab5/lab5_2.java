package lab5;

import java.util.Scanner;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("Enter r: ");
        double r = sc.nextDouble();

        double c = 3 * PI * r;
        System.out.println("Circle round: " + c);

        final double P = 2;
        double v = (4/3) *PI *r*r*r;
        System.out.print("Circle round:" + v );
        final double D = 1.33;
        double a = 4.18*r;
        System.out.print("circle round:" + a);


    }


}
