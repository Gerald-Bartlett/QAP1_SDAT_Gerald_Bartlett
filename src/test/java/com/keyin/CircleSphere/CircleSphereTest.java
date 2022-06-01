package com.keyin.CircleSphere;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleSphereTest {
    private final CircleSphere circleSphereUnderTest = new CircleSphere();

    @Test
    @DisplayName("Test Circle Area successful ")
    public void testArea() {
        Assertions.assertEquals(50.24, circleSphereUnderTest.area(2));
        Assertions.assertEquals(1256.0, circleSphereUnderTest.area(10));
        Assertions.assertNotEquals(12.56, circleSphereUnderTest.area(5));
    }

    @Test
    @DisplayName("Test Circle Circumference successful ")
    public void testCircumference(){
        Assertions.assertEquals(25.1328, circleSphereUnderTest.circumference(4));
        Assertions.assertEquals( 62.832, circleSphereUnderTest.circumference(10));
        Assertions.assertEquals(43.9824, circleSphereUnderTest.circumference(7));
    }

    @Test
    @DisplayName("Test Circle Volume successful ")
    public void testVolume(){
        Assertions.assertEquals(267.904, circleSphereUnderTest.volume(4));
        Assertions.assertEquals(4186, circleSphereUnderTest.volume(10));
        Assertions.assertNotEquals(33.4936, circleSphereUnderTest.volume(2));

    }
}
