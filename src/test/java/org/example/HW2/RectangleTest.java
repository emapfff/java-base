package org.example.HW2;

import org.example.HW2.Task2.Rectangle;
import org.example.HW2.Task2.Square;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    static Arguments[] rectangles() {
        return new Arguments[]{
                Arguments.of(new Rectangle()),
                Arguments.of(new Square())
        };
    }

    @ParameterizedTest
    @MethodSource("rectangles")
    void rectangleArea(Rectangle rect) {
        rect.setWidth(20);
        rect.setHeight(10);

        assertEquals(rect.area(), 200.0);
    }
}
