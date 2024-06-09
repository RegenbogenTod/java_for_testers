package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void CalculatePerimeter() {
        Assertions.assertEquals(15.0, Triangle.TrianglePerimeter(5.0, 6.0, 4.0));
    }

    @Test
    void CalculateSquare() {
        Assertions.assertEquals(6.0, Triangle.TriangleSquare(3.0, 4.0, 5.0));

    }
}
