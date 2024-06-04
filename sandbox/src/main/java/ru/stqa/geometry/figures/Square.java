package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + SquareArea(side));
    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
