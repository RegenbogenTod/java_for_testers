package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqureTests {
    @Test
    void canCalculateArea () {
        double result = Square.Area(5.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter () {
        Assertions.assertEquals( 20, Square.perimeter(5.0));
    }
}
