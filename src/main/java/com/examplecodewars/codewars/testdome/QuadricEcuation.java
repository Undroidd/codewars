package com.examplecodewars.codewars.testdome;


public class QuadricEcuation {

    public static Roots findRoots(double a, double b, double c) {
        final double b2 = Math.pow(b, 2);
        double ac = 4 * a * c;

        final double sqrt = Math.sqrt(b2 - ac);

        double minusb = b * -1.0;

        final double sus1 = minusb + sqrt;
        final double sus2 = minusb - sqrt;

        double doia = a * 2;

        final double result1 = sus1 / doia;
        final double result2 = sus2 / doia;


        return new Roots(result1, result2);

    }

    public static void main(String[] args) {
        Roots roots = QuadricEcuation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
