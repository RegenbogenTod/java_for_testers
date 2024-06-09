package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {public static void printTrianglePerimeter(double a, double b, double c) {
    var text  = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TrianglePerimeter(a, b, c));
    System.out.println(text);
}

    public static double TrianglePerimeter(double a, double b, double c) {
        return a + b + c;
}
public static void printTriangleSquare(double a, double b, double c) {
    var text  = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleSquare(a, b, c));
    System.out.println(text);
}
public static double TriangleSquare(double a, double b, double c) {
    var p = TrianglePerimeter(a, b, c) / 2;
    return sqrt(p * (p - a) * (p - b) * (p - c));
}
}