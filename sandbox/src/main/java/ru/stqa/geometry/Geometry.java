package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0);
        Square.printSquareArea(5.0);
        Square.printSquareArea(3.0);

        Rectangle.printRectanglrArea (3.0, 5.0);
        Rectangle.printRectanglrArea (7.0, 9.0);

        Triangle.printTrianglePerimeter(5.0, 6.0, 4.0);
        Triangle.printTrianglePerimeter(7.0, 4.0, 4.0);
        Triangle.printTriangleSquare(7.0, 4.0, 4.0);

    }

}
